package plasticmod.plastic.colorcarpetblock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.IBlockAccess;

public class PlasticblockoliveCarpet extends PlasticblockredCarpet
{

	@Override
	@SideOnly(Side.CLIENT)
	public int getRenderColor(int meta)
	{
		return 0x808000;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z)
	{
		return 0x808000;
	}
}
