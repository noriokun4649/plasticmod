package plasticmod.plastic.colorcarpetblock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.IBlockAccess;

public class PlasticblockmediumturquoiseCarpet extends PlasticblockredCarpet
{

	@Override
	@SideOnly(Side.CLIENT)
	public int getRenderColor(int meta)
	{
		return 0x48d1cc;
	}
	@Override
	@SideOnly(Side.CLIENT)
	public int colorMultiplier(IBlockAccess iBlockAccess, int x, int y, int z)
	{
		return 0x48d1cc;
	}
}
