package michael_gillen.prankster.blocks;

import michael_gillen.prankster.Reference;
import net.minecraft.block.Block;

public class BlockPrankChest extends Block{
	

	public BlockPrankChest() {
		super(Reference.PRANKCHEST);
		setUnlocalizedName(Reference.pranksterBlocks.PRANKCHEST.getUnlocalizedName());
		setRegistryName(Reference.pranksterBlocks.PRANKCHEST.getRegistryName());
	}
}
