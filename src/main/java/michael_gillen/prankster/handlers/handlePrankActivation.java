package michael_gillen.prankster.handlers;

import michael_gillen.prankster.items.ItemPrankBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

public class handlePrankActivation {
	
	@SubscribeEvent(priority = EventPriority.HIGH)
	public void handleActivation(PlayerInteractEvent.RightClickBlock event) {
		if (event.getSide() == Side.SERVER) {
			System.out.println("server side");
			BlockPos pos = event.getPos();
			TileEntity tile = event.getWorld().getTileEntity(pos);
			if (tile != null) {
				if (tile.getTileData().hasKey(ItemPrankBase.PRANK_TAG)) {
					BlockPos playerPos = event.getEntityPlayer().getPosition();
					System.out.println("prank player " + event.getEntityPlayer().getName() + " at " + playerPos.toString());
				
					switch(tile.getTileData().getByte(ItemPrankBase.PRANK_TAG)) {
						case 0: 
							event.getWorld().addWeatherEffect(new EntityLightningBolt(event.getWorld(), playerPos.getX(), playerPos.getY(), playerPos.getZ(), false));
					}
					tile.getTileData().removeTag(ItemPrankBase.PRANK_TAG);
				}
			}
		}
	}
}
