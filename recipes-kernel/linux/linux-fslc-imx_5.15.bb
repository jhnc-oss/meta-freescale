# Released under the MIT license (see COPYING.MIT for the terms)
#
# SPDX-License-Identifier: MIT
#

SUMMARY = "Linux Kernel provided by NXP and supported by Community"
DESCRIPTION = "Linux Kernel provided by NXP as the part of release distribution. \
Main focus is set on i.MX Family Reference Boards. \
It includes support for many NXP Proprietary IPs (GPU, VPU, IPU). \
Latest stable Kernel patchlevel is applied and maintained by Community."

###############################################################################
# This recipe (and corresponding kernel repository and branch) receives updates
# from 3 different sources:
# 1. Stable [linux-5.15.y] branch updates of korg;
# 2. NXP-specific updates via branch [5.10-2.1.x-imx] shared via CodeAurora forum;
# 3. Critical patches, which are not (yet) integrated into either of 2 above
#    sources, but are required to be applied to the kernel tree.
#
# Therefore, there is a need to keep track on the patches which are introduced
# from every source. This could be achieved in this recipe by filling the
# below list with the information once the update is performed from any source.
#
# Once the critical patch gets merged into the stable branch, or NXP-specific
# patches would be covered by the tag - individual entries from sections below
# could be removed.
#
# ------------------------------------------------------------------------------
# 1. Stable (tag or SHA(s))
# ------------------------------------------------------------------------------
#    tag: v5.15.60
#
# ------------------------------------------------------------------------------
# 2. NXP-specific (tag or SHA(s))
# ------------------------------------------------------------------------------
#    tag: lf-5.15.52-2.1.0
#
# ------------------------------------------------------------------------------
# 3. Critical patches (SHA(s))
# ------------------------------------------------------------------------------
# beacf1c5267a fec_uio: fix implicit declaration
# e8093f50522f cert host tools: Stop complaining about deprecated OpenSSL functions
# 49c2d3b7964d gpio: fix enabling GPIO_VF610
# c04a396fcbf7 ARM: mach-imx: conditionally disable some functions from busfreq-imx
# 166a38557bf9 drm: bridge: it6161: add missing gpio consumer header
# 5abdee26320f Revert "ASoC: imx-card: Fix DSD/PDM mclk frequency"
# 6da679049e7f Revert "LF-5445: media: imx-jpeg: Add pm-sleep support for imx-jpeg"
# a62c5aa0d000 Revert "media: imx-jpeg: Don't clear stop state in handling dynamic resolution change"
# b54e0195c2e3 Revert "LF-6878: LF-6654: media: imx-jpeg: Implement g_selection and s_selection"
# 21f50ad28213 Revert "LF-6493: media: imx-jpeg: Add a timeout mechanism for each frame"
# 44970f9fbed6 Revert "media: imx-jpeg: Align upwards buffer size"
# ee7468eafdaa Revert "LF-6878: LF-6658: media: imx-jpeg: Support contiguous and non contiguous format"
# bb6e70bff1b7 drivers/soc/imx/gpcv2.c: complete patch revert
# a682d463667a Revert "serial: fsl_lpuart: Reset prior to registration"
#
# NOTE to upgraders:
# This recipe should NOT collect individual patches, they should be applied to
# the linux-fslc kernel tree on the corresponding branch, and tracking
# information should be properly filled in above.
###############################################################################

include linux-fslc.inc

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

KBRANCH = "5.15-2.1.x-imx"
SRCREV = "9dcc132b0caa04022a9adbb76510258684fbfef7"

# PV is defined in the base in linux-imx.inc file and uses the LINUX_VERSION definition
# required by kernel-yocto.bbclass.
#
# LINUX_VERSION define should match to the kernel version referenced by SRC_URI and
# should be updated once patchlevel is merged.
LINUX_VERSION = "5.15.77"

# Local version indicates the branch name in the NXP kernel tree where patches are collected from.
LOCALVERSION = "-5.15.77-2.1.0"

DEFAULT_PREFERENCE = "1"

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"