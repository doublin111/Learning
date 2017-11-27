package Playground1.Program3;

public class Main {

    public static void main(String[] args) {

        Player Johnny = new Player("Johnny", Skill.generate(), Skill.generate(), Skill.generate(), Skill.generate(), Skill.generate(), Skill.generate(), Skill.generate());
        Johnny.printSkills();

        Player Albert = new Player("Albert", Skill.generate(), Skill.generate(), Skill.generate(), Skill.generate(), Skill.generate(), Skill.generate(), Skill.generate());
        Albert.printSkills();

        Player Frank = new Player("Frank", Skill.generate(), Skill.generate(), Skill.generate(), Skill.generate(), Skill.generate(), Skill.generate(), Skill.generate());
        Frank.printSkills();
    }
}
