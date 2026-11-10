import ee.tkasekamp.vickywaranalyzer.core.Battle;
import ee.tkasekamp.vickywaranalyzer.core.Unit;

public final class WarModelTest {
    public static void main(String[] args) {
        Battle battle = new Battle("1836.1.1", "Channel");
        battle.setAttackerUnits(new Unit[] {new Unit("frigate", 3), new Unit("cruiser", 4)});
        battle.setDefenderUnits(new Unit[] {new Unit("infantry", 2)});
        battle.determineType();
        if (battle.getBattleType() != Battle.Type.NAVAL) {
            throw new AssertionError("frigate battle must be naval");
        }
        if (battle.attackerUnitSize() != 7 || battle.defenderUnitSize() != 2) {
            throw new AssertionError("unit counts must match battle units");
        }

        Battle landBattle = new Battle("1836.1.2", "Hills");
        landBattle.setAttackerUnits(new Unit[] {new Unit("infantry", 2)});
        landBattle.setDefenderUnits(new Unit[] {new Unit("artillery", 1)});
        landBattle.determineType();
        if (landBattle.getBattleType() != Battle.Type.LAND) {
            throw new AssertionError("land units must not become a naval battle");
        }
    }
}
