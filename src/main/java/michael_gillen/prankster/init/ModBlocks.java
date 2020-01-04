package michael_gillen.prankster.init;

import michael_gillen.prankster.blocks.BlockPrankChest;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static Block prankchest;
	
	public static void init() {
		prankchest = new BlockPrankChest();
	}
	
	public static void registerBlocks(IForgeRegistry<Block> registry) {
		registry.registerAll(prankchest);
	}
		
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registerBlockItem(prankchest, registry);
	}
	
	private static void registerBlockItem(Block block, IForgeRegistry<Item> registery) {
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		registery.register(item);
	}
	
	public static void registerRenders() {
		registerRender(prankchest);
		
	}
	
	public static void registerRenderTileEntities() {
		
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
