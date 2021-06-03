package hello.core.member;

public class MemberServiceImpl implements MemberService{

    // ! 의존관계가 인터페이스에만 의존하지 않고 구현체에도 의존하고 있다 => SOLID의 DIP 규칙 위반
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
         memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
