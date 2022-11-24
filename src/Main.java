public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHp(500);
        boss.setDmg(40);
        boss.setName("Irondaun");
        boss.weapon.setWeaponName("AK47");
        boss.weapon.setWeaponType(WeaponType.PNEUMATIC);
        System.out.println("health" + boss.getHp() + "damage:" + boss.getDmg() + "name" + boss.getName() +
                "name of weapon: " + boss.weapon.getWeaponName() + "type of weapon: " + boss.weapon.getWeaponType());


    }
}