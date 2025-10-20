package l.M.x;

import java.util.ArrayList;
import java.util.List;

public class _06µ extends v_5 {
   // $FF: synthetic field
   public String _;
   // $FF: synthetic field
   public int µv8;
   // $FF: synthetic field
   public String _µv;
   // $FF: synthetic field
   public String v_;
   // $FF: synthetic field
   public List<String> µ8_;
   // $FF: synthetic field
   public List<µµvv> µ;
   // $FF: synthetic field
   public List<v81> µ0;
   // $FF: synthetic field
   public List<µ2> µv;
   // $FF: synthetic field
   public List<String> v0;
   // $FF: synthetic field
   public List<_6> µ6;
   // $FF: synthetic field
   private static int d;
   // $FF: synthetic field
   private static boolean m;
   // $FF: synthetic field
   private static final int u;
   // $FF: synthetic field
   private static final int z;
   // $FF: synthetic field
   private static final int AH;
   // $FF: synthetic field
   private static final int O;
   // $FF: synthetic field
   private static final int E;
   // $FF: synthetic field
   private static final int vR;
   // $FF: synthetic field
   private static final int g;
   // $FF: synthetic field
   private static final int X;
   // $FF: synthetic field
   private static final int e5;
   // $FF: synthetic field
   private static final int u8;
   // $FF: synthetic field
   private static final int C;
   // $FF: synthetic field
   private static final int I;
   // $FF: synthetic field
   private static final int K;

   // $FF: synthetic method
   public void v(µ0 var1) {
      v_5 var2 = var1.v(this._, this.µv8, this._µv);
      if (var2 != null) {
         if (this.v_ != null) {
            var2.v(this.v_);
         }

         int var3;
         int var4;
         if (this.µ8_ != null) {
            var3 = X;
            var4 = this.µ8_.size();

            while(var3 < var4) {
               var2._v((String)this.µ8_.get(var3));
               ++var3;
               if (d < 0) {
                  throw null;
               }
            }
         }

         if (this.µ != null) {
            var3 = e5;
            var4 = this.µ.size();

            while(var3 < var4) {
               ((µµvv)this.µ.get(var3)).v(var2);
               ++var3;
               if (d < 0) {
                  throw null;
               }
            }
         }

         if (this.µ0 != null) {
            var3 = u8;
            var4 = this.µ0.size();

            while(var3 < var4) {
               ((v81)this.µ0.get(var3)).v(var2);
               ++var3;
               if (d < 0) {
                  throw null;
               }
            }
         }

         if (this.µv != null) {
            var3 = C;
            var4 = this.µv.size();

            while(var3 < var4) {
               ((µ2)this.µv.get(var3)).v(var2);
               ++var3;
               if (d < 0) {
                  throw null;
               }
            }
         }

         if (this.v0 != null) {
            var3 = I;
            var4 = this.v0.size();

            while(var3 < var4) {
               var2._((String)this.v0.get(var3));
               ++var3;
               if (m) {
                  throw null;
               }
            }
         }

         if (this.µ6 != null) {
            var3 = K;
            var4 = this.µ6.size();

            while(var3 < var4) {
               ((_6)this.µ6.get(var3)).v(var2);
               ++var3;
               if (d < 0) {
                  throw null;
               }
            }
         }

      }
   }

   // $FF: synthetic method
   public void v(String var1) {
      this.v_ = var1;
   }

   // $FF: synthetic method
   public void v(String var1, int var2, String var3) {
      if (this.µ == null) {
         this.µ = new ArrayList(AH);
      }

      this.µ.add(new µµvv(var1, var2, var3));
   }

   // $FF: synthetic method
   public _06µ(int var1, String var2, int var3, String var4, List<µµvv> var5, List<v81> var6, List<µ2> var7, List<String> var8, List<_6> var9) {
      super(var1);
      this._ = var2;
      this.µv8 = var3;
      this._µv = var4;
      this.µ = var5;
      this.µ0 = var6;
      this.µv = var7;
      this.v0 = var8;
      this.µ6 = var9;
   }

   // $FF: synthetic method
   public void v(String var1, String... var2) {
      if (this.µ6 == null) {
         this.µ6 = new ArrayList(g);
      }

      this.µ6.add(new _6(var1, v_µ.v((Object[])var2)));
   }

   // $FF: synthetic method
   public void _v() {
   }

   // $FF: synthetic method
   public void v(String var1, int var2, String... var3) {
      if (this.µ0 == null) {
         this.µ0 = new ArrayList(O);
      }

      this.µ0.add(new v81(var1, var2, v_µ.v((Object[])var3)));
   }

   // $FF: synthetic method
   public void _v(String var1, int var2, String... var3) {
      if (this.µv == null) {
         this.µv = new ArrayList(E);
      }

      this.µv.add(new µ2(var1, var2, v_µ.v((Object[])var3)));
   }

   static {
      int var10001 = -143467158;
      u = 1410170820 ^ 1409580996;
      var10001 = -362326954;
      z = (356528907 ^ U.o(1892418216)) & -1;
      AH = 640 >>> 199 | 640 << ~U.N(834666496, 1099679094) + 1;
      var10001 = 1795591092;
      O = -1048123913 ^ U.o(1336369539);
      var10001 = 115730421;
      E = 1622942009 ^ 1622942012;
      var10001 = -860405997;
      vR = -973304125 ^ -973304122;
      int var10002 = U.o(725669518);
      var10001 = 1352049451;
      g = (var10002 ^ 1902838481) & -1;
      var10002 = U.o(-2104852281);
      var10001 = 900422565;
      X = var10002 ^ -486452927;
      var10002 = U.o(-1763752998);
      var10001 = -123930291;
      e5 = (var10002 ^ 1539505001) & -1;
      var10002 = U.o(-2075426839);
      var10001 = -1202902749;
      u8 = var10002 ^ U.N(-19783273, -1509049976);
      var10002 = U.o(-1746290963);
      var10001 = -1701128993;
      C = var10002 ^ -1217554455;
      var10002 = U.o(-448705885);
      var10001 = 1816230570;
      I = var10002 ^ -984448345;
      var10002 = U.o(586775356);
      var10001 = -52215806;
      K = var10002 ^ 1021222724;
   }

   // $FF: synthetic method
   public void _v(String var1) {
      if (this.µ8_ == null) {
         this.µ8_ = new ArrayList(z);
      }

      this.µ8_.add(var1);
   }

   // $FF: synthetic method
   public _06µ(String var1, int var2, String var3) {
      super(u);
      if (this.getClass() != _06µ.class) {
         throw new IllegalStateException();
      } else {
         this._ = var1;
         this.µv8 = var2;
         this._µv = var3;
      }
   }

   // $FF: synthetic method
   public void _(String var1) {
      if (this.v0 == null) {
         this.v0 = new ArrayList(vR);
      }

      this.v0.add(var1);
   }
}
