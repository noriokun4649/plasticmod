package plasticmod.plastic.colorcarpetblock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.IBlockAccess;

public class PlasticblocklightgoldenrodyellowCarpet extends PlasticblockredCarpet
{

	@Override
	@SideOnly(Side.CLIENT)
	public int getRenderColor(int meta)
	{
		return 0xfafad2;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z)
	{
		return 0xfafad2;
	}
}