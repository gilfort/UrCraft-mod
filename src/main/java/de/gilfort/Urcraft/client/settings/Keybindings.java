package de.gilfort.Urcraft.client.settings;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import de.gilfort.Urcraft.reference.Names;

public class Keybindings {

	/*
	 * public static KeyBinding charge = new KeyBinding(Names.Keys.CHARGE,
	 * Keyboard.KEY_C, Names.Keys.CATEGORY);
	 * 
	 * public static KeyBinding release = new KeyBinding(Names.Keys.RELEASE,
	 * Keyboard.KEY_R, Names.Keys.CATEGORY);
	 * 
	 * something like this.. :)
	 */

	public static KeyBinding EXPLODE = new KeyBinding(Names.Keys.EXPLODE,
			Keyboard.KEY_C, Names.Keys.CATEGORY);

	public static KeyBinding EXPLODE_BIG = new KeyBinding(
			Names.Keys.EXPLODE_BIG, Keyboard.KEY_V, Names.Keys.CATEGORY);
}
