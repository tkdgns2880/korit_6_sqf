package com.study.java_study.ch12_추상화03;

public abstract class AbsrtactAuthority implements Authority {
    private String role;

    public AbsrtactAuthority() {
        role = DEFAULT_ROLE;
    }

    public AbsrtactAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
