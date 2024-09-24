public class Member {
    private final String name;
    private final String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    @Override
    public String toString() {
        return String.format("Member{name='%s', memberId='%s'}", name, memberId);
    }
}
