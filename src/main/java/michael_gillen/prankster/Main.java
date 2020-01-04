package michael_gillen.prankster;

import michael_gillen.prankster.handlers.handlePrankActivation;
import michael_gillen.prankster.init.ModBlocks;
import michael_gillen.prankster.init.ModItems;
import michael_gillen.prankster.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION) 
@Mod.EventBusSubscriber
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		ModItems.registerItems(event.getRegistry());
		ModBlocks.registerItemBlocks(event.getRegistry());
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		ModBlocks.registerBlocks(event.getRegistry());
	}
	
	@EventHandler
	public void pre_init(FMLPreInitializationEvent e) {
		MinecraftForge.EVENT_BUS.register(new handlePrankActivation());
		ModItems.init();	
		ModBlocks.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init();
	}
	
	@EventHandler
	public void post_init(FMLPostInitializationEvent e) {
		
	}
}
