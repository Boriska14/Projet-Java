package entity;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ButterflyTest.class, CrocTest.class, DiamondTest.class, ElementTest.class, EnemyTest.class,
		FloorTest.class, GroundTest.class, MobileElementTest.class, PlayerTest.class, RockTest.class, WallTest.class })
public class AllTests {

}
