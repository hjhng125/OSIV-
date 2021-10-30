package me.hjhng.osiv;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository members;

    public MemberView findMember(Long memberId) {
        return members.findById(memberId).orElseThrow();
    }

    public Member findMemberBy(Long memberId) {
        return members.findById(memberId).orElseThrow();
    }

    @Transactional
    public void add(Member member) {
        members.save(member);
    }
}
