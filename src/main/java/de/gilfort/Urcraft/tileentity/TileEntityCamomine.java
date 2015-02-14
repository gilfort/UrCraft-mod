package de.gilfort.Urcraft.tileentity;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import de.gilfort.Urcraft.utility.LogHelper;

public class TileEntityCamomine extends TileEntity {

	private int timer = 80;

	public void updateEntity() {
		if (timer > 0) {
			timer--;
		}
		LogHelper.info(timer);
		if (timer == 0 && !worldObj.isRemote) {
			List<Entity> entities = worldObj.getEntitiesWithinAABB(
					EntityPlayer.class, AxisAlignedBB.getBoundingBox(
							xCoord - 2, yCoord - 1, zCoord - 2, xCoord + 3,
							yCoord + 3, zCoord + 3));
			if (entities.size() > 0) {
				worldObj.createExplosion(null, xCoord + 0.5F, yCoord + 0.5F,
						zCoord + 0.5F, 3.0F, true);

			}
		}
	}

	public void readFromNBT(NBTTagCompound tag) {
		super.readFromNBT(tag);
		timer = tag.getInteger("timer");
	}

	public void writeToNBT(NBTTagCompound tag) {
		super.writeToNBT(tag);
		tag.setInteger("timer", timer);
	}

}
