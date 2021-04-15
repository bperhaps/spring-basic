package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> cache = new HashMap<>();

    @Override
    public void save(Member member) {
        cache.put(member.getId(), member);
    }

    @Override
    public Member findById(Long id) {
        return cache.get(id);
    }

}
