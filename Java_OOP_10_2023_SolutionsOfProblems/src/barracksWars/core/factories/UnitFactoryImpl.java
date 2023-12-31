package barracksWars.core.factories;

import barracksWars.interfaces.Unit;
import barracksWars.interfaces.UnitFactory;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws  ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

		Class<?> unitClazz=Class.forName(UNITS_PACKAGE_NAME+unitType);
		Constructor<Unit> unitConstructor= (Constructor<Unit>) unitClazz.getDeclaredConstructor();
		unitConstructor.setAccessible(true);
		return  unitConstructor.newInstance();

	}
}
