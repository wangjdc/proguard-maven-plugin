ProGuard Maven Plugin
---------------------

Run [ProGuard] as part of your [Maven] build. For usage, please read the
generated [Documentation](http://wvengen.github.io/proguard-maven-plugin/).

Development happens at [Github](https://github.com/wvengen/proguard-maven-plugin).
This plugin is currently not under active development, but pull requests are
welcome.

This is the successor of the [ProGuard Maven Plugin by pyx4me](http://pyx4me.com/pyx4me-maven-plugins/proguard-maven-plugin/).


[![Build Status](https://travis-ci.org/wvengen/proguard-maven-plugin.svg?branch=master)](https://travis-ci.org/wvengen/proguard-maven-plugin)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.wvengen/proguard-maven-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.wvengen/proguard-maven-plugin)


[ProGuard]: http://proguard.sourceforge.net/
[Maven]: http://apache.maven.org/
支持多模块的混肴  只要在 顶级pom中配置混肴即可， 对于pom 直接跳过。
支持零修改混肴，默认读取 配置${user.home}/.m2/proguard.conf 在项目中直接调用混肴的插件即可。
支持war 混肴，将classes目录下的文件混肴，重新打war包。
TODO 将来支持零配置，将默认的配置植入 插件中
