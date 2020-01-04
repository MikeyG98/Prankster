package michael_gillen.prankster.init;

import michael_gillen.prankster.items.ItemPrankBase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	
	public static Item prankbase;
	public static Item prankcreeper;
	public static Item pranklightning;
	public static Item pranktnt;
	public static Item prankpotion;
	public static Item prankwither;
	public static Item pranklava;
	public static Item prankfire;
	public static Item pranknetherport;
	public static Item prankenderport;
	
	public static void init() {
		prankbase = new ItemPrankBase();
	}
	
	public static void registerItems(IForgeRegistry<Item> registery) {
		registery.registerAll(prankbase);
	}
	
	public static void registerRenders() {
		registerRender(prankbase);
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
