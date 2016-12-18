package plasticmod.plastic.villager;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.registry.VillagerRegistry.IVillageCreationHandler;
import net.minecraft.util.MathHelper;
import net.minecraft.world.gen.structure.StructureVillagePieces;

public class VillageCreationHandlePlasticHouse implements IVillageCreationHandler {

	@Override
	public StructureVillagePieces.PieceWeight getVillagePieceWeight(Random random, int i) {
		/*
		 * 詳細不明ですが構造物生成の重み付けをしているようで
		 */
		return new StructureVillagePieces.PieceWeight(getComponentClass(), 20, MathHelper.getRandomIntegerInRange(random, i, i+1));
	}

	@Override
	public Class<?> getComponentClass() {
		/*
		 * 実際に構造物を生成するクラスを返却します
		 * ここでは今回新しく追加するサンプル村人用の家生成クラスを返却しています
		 */
		return ComponentVillagePlasticHouse.class;
	}

	@Override
	public Object buildComponent(StructureVillagePieces.PieceWeight villagePiece,
                                 StructureVillagePieces.Start startPiece, List pieces, Random random,
			int p1, int p2, int p3, int p4, int p5) {
		/*
		 * 構造物生成のトリガーで呼ばれます
		 * ここでは今回追加したサンプル村人用の家生成メソッドにそのまま処理を丸投げしています
		 */
		return ComponentVillagePlasticHouse.buildComponent(startPiece, pieces, random, p1, p2, p3, p4, p5);
	}

}