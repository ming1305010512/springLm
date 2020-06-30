package com.alsa.container.environmentAbstraction.beanDefinitionProfiles.useProfile;

/**
 * @Created with IDEA
 * @author:longming
 * @Date: 2020/6/16
 * @Time: 19:29
 * @Description:
 */
public class ProfileEntity {

    /**
     * 环境名称
     */
    private String profileName;

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    @Override
    public String toString() {
        return "ProfileEntity{" +
                "profileName='" + profileName + '\'' +
                '}';
    }
}
