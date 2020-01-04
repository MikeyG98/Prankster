package michael_gillen.prankster.items;

import michael_gillen.prankster.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemPrankBase extends Item {
	
	public static final String PRANK_TAG = "pranked";
	
	public ItemPrankBase() {
		setUnlocalizedName(Reference.pranksterItems.ITEMPRANKBASE.getUnlocalizedName());
		setRegistryName(Reference.pranksterItems.ITEMPRANKBASE.getRegistryName());
		setCreativeTab(CreativeTabs.MISC);
		setMaxStackSize(1);
		
	}
	
	@Override
	public EnumActionResult onItemUseFirst(EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX,
			float hitY, float hitZ, EnumHand hand) {
		TileEntity tile = world.getTileEntity(pos);
		if (tile != null) {
			NBTTagCompound nbt = tile.getTileData();
			if(nbt.hasKey(PRANK_TAG)) {
				return EnumActionResult.PASS;
			}
			nbt.setByte(PRANK_TAG, (byte) 0);
			return EnumActionResult.SUCCESS;
		}
		return EnumActionResult.PASS;
	}
}
