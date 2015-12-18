package com.vaibhav.developer.ad.findings.news;

/**
 * Created by Administrator on 05-05-2015.
 */
public interface Injectable {
    /**
     * Injects the members of given object, including injectable members
     * inherited from its supertypes.
     * @param object object with members to be injected
     */
    void inject(Object object);
}
