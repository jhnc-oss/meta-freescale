# Copyright (C) 2016 Freescale Semiconductor
# Copyright (C) 2017-2019,2024 NXP
SUMMARY = "A Daemon wait for NXP mfgtools host's command"
SECTION = "base"
DEPENDS = "virtual/kernel dosfstools-native"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

PR = "r1"
PV = "0.5.1+git${SRCPV}"

SRC_URI = "git://github.com/NXPmicro/imx-uuc.git;protocol=https;branch=master"
SRCREV = "25f65e10368aa07056f9536e88ed911ac7f38f99"

do_install() {
    oe_runmake 'DESTDIR=${D}' install
}

FILES:${PN} += "/linuxrc /fat"

COMPATIBLE_MACHINE = "(imx-generic-bsp)"
