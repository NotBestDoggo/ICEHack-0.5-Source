//Deobfuscated with https://github.com/PetoPetko/Minecraft-Deobfuscator3000 using mappings "1.12 stable mappings"!

package me.fluffycq.icehack.mixin.client;

import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = {Entity.class}, priority = 2147483647)
public abstract class MixinEntity {
  @Shadow
  public double posX;
  
  @Shadow
  public double posY;
  
  @Shadow
  public double posZ;
  
  @Shadow
  public double prevPosX;
  
  @Shadow
  public double prevPosY;
  
  @Shadow
  public double prevPosZ;
  
  @Shadow
  public double lastTickPosX;
  
  @Shadow
  public double lastTickPosY;
  
  @Shadow
  public double lastTickPosZ;
  
  @Shadow
  public float prevRotationYaw;
  
  @Shadow
  public float prevRotationPitch;
  
  @Shadow
  public float rotationPitch;
  
  @Shadow
  public float rotationYaw;
  
  @Shadow
  public boolean onGround;
  
  @Shadow
  public double motionX;
  
  @Shadow
  public double motionY;
  
  @Shadow
  public double motionZ;
  
  @Shadow
  public abstract boolean equals(Object paramObject);
  
  @Shadow
  public abstract boolean isSprinting();
  
  @Shadow
  public abstract boolean isRiding();
  
  @Shadow
  public void move(MoverType paramMoverType, double paramDouble1, double paramDouble2, double paramDouble3) {}
}
