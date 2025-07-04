DESCRIPTION = "i.MX U-Boot suppporting i.MX reference boards."

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
UBOOT_SRC ?= "git://github.com/nxp-imx/uboot-imx.git;protocol=https"
SRCBRANCH = "lf_v2024.04"
LOCALVERSION ?= "-${SRCBRANCH}"
SRCREV = "e3219a5a73445219df605d1492687918d488055c"

DEPENDS += " \
    bc-native \
    bison-native \
    dtc-native \
    flex-native \
    gnutls-native \
    xxd-native \
"

B = "${WORKDIR}/build"

inherit fsl-u-boot-localversion

BOOT_TOOLS = "imx-boot-tools"
