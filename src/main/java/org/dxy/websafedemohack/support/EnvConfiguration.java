package org.dxy.websafedemohack.support;


public interface EnvConfiguration {

    default String site() {
        return "";
    }

    default String hackSite() {
        return "";
    }

}
