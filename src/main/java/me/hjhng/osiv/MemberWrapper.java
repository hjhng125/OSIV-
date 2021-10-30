package me.hjhng.osiv;

import lombok.Builder;

@Builder
public class MemberWrapper {

    private Member member;

    public String getName() {
        return member.getName();
    }
}
