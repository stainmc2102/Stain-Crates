package l.M.x;

import java.util.List;

public class µµ extends µ3v76 {
   // $FF: synthetic field
   public int _;
   // $FF: synthetic field
   public String µv8;
   // $FF: synthetic field
   public String _µv;
   // $FF: synthetic field
   public String v_;
   // $FF: synthetic field
   public Object µ8_;
   // $FF: synthetic field
   public List<v__> µ;
   // $FF: synthetic field
   public List<v__> µ0;
   // $FF: synthetic field
   public List<v4> µv;
   // $FF: synthetic field
   public List<v4> v0;
   // $FF: synthetic field
   public List<_> µ6;
   // $FF: synthetic field
   private static int l;
   // $FF: synthetic field
   private static boolean z;
   // $FF: synthetic field
   private static final int o;
   // $FF: synthetic field
   private static final int n;
   // $FF: synthetic field
   private static final int vX;
   // $FF: synthetic field
   private static final int t;
   // $FF: synthetic field
   private static final int lz;
   // $FF: synthetic field
   private static final int F;
   // $FF: synthetic field
   private static final int a;
   // $FF: synthetic field
   private static final int k;
   // $FF: synthetic field
   private static final int R;
   // $FF: synthetic field
   private static final int F5;
   // $FF: synthetic field
   private static final int N;

   // $FF: synthetic method
   public µµ(int var1, String var2, String var3, String var4, Object var5) {
      this(o, var1, var2, var3, var4, var5);
      if (this.getClass() != µµ.class) {
         throw new IllegalStateException();
      }
   }

   // $FF: synthetic method
   public v v(int var1, µ52 var2, String var3, boolean var4) {
      v4 var5 = new v4(var1, var2, var3);
      if (var4) {
         this.µv = v_µ.v(this.µv, var5);
         if (!z) {
            throw null;
         }
      } else {
         this.v0 = v_µ.v(this.v0, var5);
      }

      return var5;
   }

   // $FF: synthetic method
   public v v(String var1, boolean var2) {
      v__ var3 = new v__(var1);
      if (var2) {
         this.µ = v_µ.v(this.µ, var3);
         if (!z) {
            throw null;
         }
      } else {
         this.µ0 = v_µ.v(this.µ0, var3);
      }

      return var3;
   }

   // $FF: synthetic method
   public void v(_ var1) {
      this.µ6 = v_µ.v(this.µ6, var1);
   }

   static {
      int var10002 = U.o(106891319);
      int var10001 = 1603245482;
      o = var10002 ^ -333841824;
      var10002 = U.N(632409372, 419685844);
      var10001 = 381252878;
      n = var10002 ^ U.o(-633099464);
      var10002 = U.o(2090361922);
      var10001 = -998668206;
      vX = var10002 ^ 1109793086;
      t = 4 >>> U.o(1107296256) | 4 << ~66 + 1;
      var10002 = U.o(-2050096958);
      var10001 = -1970156103;
      lz = var10002 ^ U.N(1948803086, 1683584917);
      var10002 = U.o(-1367460466);
      var10001 = -194693462;
      F = var10002 ^ 1907129973;
      var10002 = U.o(-525484552);
      var10001 = -895715417;
      a = var10002 ^ 532526343;
      k = 2097152 >>> U.o(-1392508928) | 2097152 << ~181 + 1;
      var10002 = U.o(1325900650);
      var10001 = -1513552005;
      R = var10002 ^ 1455808754;
      var10002 = U.o(747310856);
      var10001 = -142268301;
      F5 = var10002 ^ 284217652;
      var10002 = U.o(1764083288);
      var10001 = -1942464909;
      N = var10002 ^ 442737814;
   }

   // $FF: synthetic method
   public void v(µ0 var1) {
      µ3v76 var2 = var1.v(this._, this.µv8, this._µv, this.v_, this.µ8_);
      if (var2 != null) {
         int var3;
         int var4;
         v__ var5;
         if (this.µ != null) {
            var3 = vX;
            var4 = this.µ.size();

            while(var3 < var4) {
               var5 = (v__)this.µ.get(var3);
               var5.v(var2.v(var5._, (boolean)t));
               ++var3;
               if (l >= 0) {
                  throw null;
               }
            }
         }

         if (this.µ0 != null) {
            var3 = lz;
            var4 = this.µ0.size();

            while(var3 < var4) {
               var5 = (v__)this.µ0.get(var3);
               var5.v(var2.v(var5._, (boolean)F));
               ++var3;
               if (!z) {
                  throw null;
               }
            }
         }

         v4 var6;
         if (this.µv != null) {
            var3 = a;
            var4 = this.µv.size();

            while(var3 < var4) {
               var6 = (v4)this.µv.get(var3);
               var6.v(var2.v(var6.µ, var6.µ0, var6._, (boolean)k));
               ++var3;
               if (l >= 0) {
                  throw null;
               }
            }
         }

         if (this.v0 != null) {
            var3 = R;
            var4 = this.v0.size();

            while(var3 < var4) {
               var6 = (v4)this.v0.get(var3);
               var6.v(var2.v(var6.µ, var6.µ0, var6._, (boolean)F5));
               ++var3;
               if (l >= 0) {
                  throw null;
               }
            }
         }

         if (this.µ6 != null) {
            var3 = N;
            var4 = this.µ6.size();

            while(var3 < var4) {
               var2.v((_)this.µ6.get(var3));
               ++var3;
               if (!z) {
                  throw null;
               }
            }
         }

         var2._v();
      }
   }

   // $FF: synthetic method
   public void v(int var1) {
      if (var1 == n) {
         if (this.µv != null && !this.µv.isEmpty()) {
            throw new µ4_vv();
         }

         if (this.v0 != null && !this.v0.isEmpty()) {
            throw new µ4_vv();
         }
      }

   }

   // $FF: synthetic method
   public µµ(int var1, int var2, String var3, String var4, String var5, Object var6) {
      super(var1);
      this._ = var2;
      this.µv8 = var3;
      this._µv = var4;
      this.v_ = var5;
      this.µ8_ = var6;
   }

   // $FF: synthetic method
   public void _v() {
   }
}
