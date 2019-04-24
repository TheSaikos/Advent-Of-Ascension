package net.nevermine.izer;

import net.minecraftforge.common.DimensionManager;
import net.nevermine.assist.ConfigurationHelper;
import net.nevermine.dimension.abyss.WorldProviderAB;
import net.nevermine.dimension.ancientcavern.WorldProviderAcv;
import net.nevermine.dimension.barathos.WorldProviderBt;
import net.nevermine.dimension.candyland.WorldProviderCd;
import net.nevermine.dimension.celeve.WorldProviderCl;
import net.nevermine.dimension.creeponia.WorldProviderCp;
import net.nevermine.dimension.crystevia.WorldProviderCr;
import net.nevermine.dimension.deeplands.WorldProviderDp;
import net.nevermine.dimension.dustopia.WorldProviderDs;
import net.nevermine.dimension.gardencia.WorldProviderGd;
import net.nevermine.dimension.greckon.WorldProviderGk;
import net.nevermine.dimension.haven.WorldProviderHv;
import net.nevermine.dimension.immortallis.WorldProviderIm;
import net.nevermine.dimension.iromine.WorldProviderIr;
import net.nevermine.dimension.labricon.WorldProviderLc;
import net.nevermine.dimension.lborean.WorldProviderLb;
import net.nevermine.dimension.lelyetia.WorldProviderLl;
import net.nevermine.dimension.lunalus.WorldProviderLu;
import net.nevermine.dimension.mysterium.WorldProviderMy;
import net.nevermine.dimension.precasia.WorldProviderPc;
import net.nevermine.dimension.runandor.WorldProviderRn;
import net.nevermine.dimension.shyrelands.WorldProviderSh;
import net.nevermine.dimension.voxponds.WorldProviderVp;

public class Dimensionizer {
	public static int abyssId = ConfigurationHelper.abyss;
	public static int havenId = ConfigurationHelper.haven;
	public static int precasiaId = ConfigurationHelper.precasia;
	public static int mysteriumId = ConfigurationHelper.mysterium;
	public static int iromineId = ConfigurationHelper.iromine;
	public static int lunalusId = ConfigurationHelper.lunalus;
	public static int deeplandsId = ConfigurationHelper.deeplands;
	public static int gardenciaId = ConfigurationHelper.gardencia;
	public static int greckonId = ConfigurationHelper.greckon;
	public static int dustopiaId = ConfigurationHelper.dustopia;
	public static int boreanId = ConfigurationHelper.lborean;
	public static int voxpondsId = ConfigurationHelper.voxponds;
	public static int runandorId = ConfigurationHelper.runandor;
	public static int barathosId = ConfigurationHelper.barathos;
	public static int labriconId = ConfigurationHelper.labricon;
	public static int lelyetiaId = ConfigurationHelper.lelyetia;
	public static int ancientcavernId = ConfigurationHelper.ancientcavern;
	public static int celeveId = ConfigurationHelper.celeve;
	public static int crysteviaId = ConfigurationHelper.crystevia;
	public static int candylandId = ConfigurationHelper.candyland;
	public static int creeponiaId = ConfigurationHelper.creeponia;
	public static int immortallisId = ConfigurationHelper.immortallis;
	public static int shyrelandsId = ConfigurationHelper.shyrelands;

	public static void init() {
		DimensionManager.registerProviderType(Dimensionizer.abyssId, WorldProviderAB.class, false);
		DimensionManager.registerDimension(Dimensionizer.abyssId, Dimensionizer.abyssId);
		DimensionManager.registerProviderType(Dimensionizer.havenId, WorldProviderHv.class, false);
		DimensionManager.registerDimension(Dimensionizer.havenId, Dimensionizer.havenId);
		DimensionManager.registerProviderType(Dimensionizer.precasiaId, WorldProviderPc.class, false);
		DimensionManager.registerDimension(Dimensionizer.precasiaId, Dimensionizer.precasiaId);
		DimensionManager.registerProviderType(Dimensionizer.mysteriumId, WorldProviderMy.class, false);
		DimensionManager.registerDimension(Dimensionizer.mysteriumId, Dimensionizer.mysteriumId);
		DimensionManager.registerProviderType(Dimensionizer.iromineId, WorldProviderIr.class, false);
		DimensionManager.registerDimension(Dimensionizer.iromineId, Dimensionizer.iromineId);
		DimensionManager.registerProviderType(Dimensionizer.lunalusId, WorldProviderLu.class, false);
		DimensionManager.registerDimension(Dimensionizer.lunalusId, Dimensionizer.lunalusId);
		DimensionManager.registerProviderType(Dimensionizer.gardenciaId, WorldProviderGd.class, false);
		DimensionManager.registerDimension(Dimensionizer.gardenciaId, Dimensionizer.gardenciaId);
		DimensionManager.registerProviderType(Dimensionizer.greckonId, WorldProviderGk.class, false);
		DimensionManager.registerDimension(Dimensionizer.greckonId, Dimensionizer.greckonId);
		DimensionManager.registerProviderType(Dimensionizer.dustopiaId, WorldProviderDs.class, false);
		DimensionManager.registerDimension(Dimensionizer.dustopiaId, Dimensionizer.dustopiaId);
		DimensionManager.registerProviderType(Dimensionizer.boreanId, WorldProviderLb.class, false);
		DimensionManager.registerDimension(Dimensionizer.boreanId, Dimensionizer.boreanId);
		DimensionManager.registerProviderType(Dimensionizer.voxpondsId, WorldProviderVp.class, false);
		DimensionManager.registerDimension(Dimensionizer.voxpondsId, Dimensionizer.voxpondsId);
		DimensionManager.registerProviderType(Dimensionizer.runandorId, WorldProviderRn.class, false);
		DimensionManager.registerDimension(Dimensionizer.runandorId, Dimensionizer.runandorId);
		DimensionManager.registerProviderType(Dimensionizer.barathosId, WorldProviderBt.class, false);
		DimensionManager.registerDimension(Dimensionizer.barathosId, Dimensionizer.barathosId);
		DimensionManager.registerProviderType(Dimensionizer.deeplandsId, WorldProviderDp.class, false);
		DimensionManager.registerDimension(Dimensionizer.deeplandsId, Dimensionizer.deeplandsId);
		DimensionManager.registerProviderType(Dimensionizer.labriconId, WorldProviderLc.class, false);
		DimensionManager.registerDimension(Dimensionizer.labriconId, Dimensionizer.labriconId);
		DimensionManager.registerProviderType(Dimensionizer.lelyetiaId, WorldProviderLl.class, false);
		DimensionManager.registerDimension(Dimensionizer.lelyetiaId, Dimensionizer.lelyetiaId);
		DimensionManager.registerProviderType(Dimensionizer.ancientcavernId, WorldProviderAcv.class, false);
		DimensionManager.registerDimension(Dimensionizer.ancientcavernId, Dimensionizer.ancientcavernId);
		DimensionManager.registerProviderType(Dimensionizer.celeveId, WorldProviderCl.class, false);
		DimensionManager.registerDimension(Dimensionizer.celeveId, Dimensionizer.celeveId);
		DimensionManager.registerProviderType(Dimensionizer.crysteviaId, WorldProviderCr.class, false);
		DimensionManager.registerDimension(Dimensionizer.crysteviaId, Dimensionizer.crysteviaId);
		DimensionManager.registerProviderType(Dimensionizer.candylandId, WorldProviderCd.class, false);
		DimensionManager.registerDimension(Dimensionizer.candylandId, Dimensionizer.candylandId);
		DimensionManager.registerProviderType(Dimensionizer.creeponiaId, WorldProviderCp.class, false);
		DimensionManager.registerDimension(Dimensionizer.creeponiaId, Dimensionizer.creeponiaId);
		DimensionManager.registerProviderType(Dimensionizer.immortallisId, WorldProviderIm.class, false);
		DimensionManager.registerDimension(Dimensionizer.immortallisId, Dimensionizer.immortallisId);
		DimensionManager.registerProviderType(shyrelandsId, WorldProviderSh.class, false);
		DimensionManager.registerDimension(shyrelandsId, shyrelandsId);
	}
}
