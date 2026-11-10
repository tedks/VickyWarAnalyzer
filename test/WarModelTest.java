import ee.tkasekamp.vickywaranalyzer.core.Battle;
import ee.tkasekamp.vickywaranalyzer.core.Unit;

public final class WarModelTest {
    public static void main(String[] args) {
        Battle battle = new Battle("1836.1.1", "Channel");
        battle.setAttackerUnits(new Unit[] {new Unit("frigate", 3)});
        battle.setDefenderUnits(new Unit[] {new Unit("infantry", 2)});
        battle.determineType();
        if (battle.getBattleType() != Battle.Type.NAVAL) {
            throw new AssertionError("frigate battle must be naval");
        }
        if (battle.attackerUnitSize() != 3 || battle.defenderUnitSize() != 2) {
            throw new AssertionError("unit counts must match battle units");
        }
    }
}
