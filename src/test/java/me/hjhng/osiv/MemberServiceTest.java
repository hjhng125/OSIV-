package me.hjhng.osiv;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberService memberService;

    @Autowired
    private MemberRepository members;

    private String name = "hong";

    private Member member;

    @BeforeEach
    void setUp() {
        member = Member.builder()
                .name(name)
                .build();

        members.save(member);
    }

    @Test
    void 일기전용_인터페이스() {
        MemberView member = memberService.findMember(1L);

        assertThat(member.getName()).isEqualTo(name);
    }

    @Test
    void 엔터티를_래핑() {
        MemberWrapper wrapper = MemberWrapper.builder()
                .member(member)
                .build();

        assertThat(wrapper.getName()).isEqualTo(name);
    }
}