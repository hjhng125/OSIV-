package me.hjhng.osiv;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/members/{memberId}")
    public String add(@PathVariable Long memberId, Model model) {
        Member member = memberService.findMemberBy(memberId);

        member.setName("****");
        model.addAttribute("member", member);

        memberService.add(member);

        return "member";
    }
}
