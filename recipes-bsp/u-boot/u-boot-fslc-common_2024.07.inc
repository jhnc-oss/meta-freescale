# Copyright (C) 2012-2022 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

inherit fsl-u-boot-localversion

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=2ca5f2c35c8cc335f0a19756634782f1"

DEPENDS += "flex-native bison-native"

SRC_URI = "git://github.com/Freescale/u-boot-fslc.git;branch=${SRCBRANCH};protocol=https"

SRCREV = "5b4d66dd41432d36c22bcdfa2d1ca4afc3a1c2fc"
SRCBRANCH = "2024.07+fslc"

PV = "2024.07+fslc+git${SRCPV}"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"
