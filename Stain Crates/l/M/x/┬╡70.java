package l.M.x;

import java.util.List;

public class µ70 extends µ8 {
   // $FF: synthetic field
   public String _;
   // $FF: synthetic field
   public String µv8;
   // $FF: synthetic field
   public String _µv;
   // $FF: synthetic field
   public List<v__> v_;
   // $FF: synthetic field
   public List<v__> µ8_;
   // $FF: synthetic field
   public List<v4> µ;
   // $FF: synthetic field
   public List<v4> µ0;
   // $FF: synthetic field
   public List<_> µv;
   // $FF: synthetic field
   private static int ig;
   // $FF: synthetic field
   private static boolean l;
   // $FF: synthetic field
   private static final int lX = 1179648 >>> 225 | 1179648 << -U.o(-2030043136);
   // $FF: synthetic field
   private static final int o = 32 >>> 82 | 32 << ~82 + 1;
   // $FF: synthetic field
   private static final int C;
   // $FF: synthetic field
   private static final int i5;
   // $FF: synthetic field
   private static final int Cu;
   // $FF: synthetic field
   private static final int Oa;
   // $FF: synthetic field
   private static final int w;
   // $FF: synthetic field
   private static final int I;
   // $FF: synthetic field
   private static final int z;
   // $FF: synthetic field
   private static final int w5;
   // $FF: synthetic field
   private static final int q;

   // $FF: synthetic method
   public void _v() {
   }

   // $FF: synthetic method
   public void v(int var1) {
      if (var1 < o) {
         throw new µ4_vv();
      }
   }

   static {
      int var10002 = U.o(121900053);
      int var10001 = 1447421451;
      C = var10002 ^ -1473240352;
      var10001 = 1472404598;
      i5 = 2062615366 ^ 2062615367;
      var10002 = U.o(-1885587613);
      var10001 = 1020278879;
      Cu = var10002 ^ -957597199;
      var10002 = U.o(-2107944721);
      var10001 = 864795889;
      Oa = (var10002 ^ -150283711) & -1;
      var10002 = U.N(1483379288, -424639398);
      var10001 = -213103823;
      w = var10002 ^ U.o(1751721304);
      I = ('耀' >>> 207 | '耀' << -207) & -1;
      var10002 = U.o(-1225845864);
      var10001 = 70830807;
      z = var10002 ^ 432600941;
      var10002 = U.o(673172154);
      var10001 = 878913270;
      w5 = var10002 ^ 1565784084;
      var10002 = U.o(-918844371);
      var10001 = -110884015;
      q = var10002 ^ -1271800685;
   }

   // $FF: synthetic method
   public µ70(String var1, String var2, String var3) {
      this(lX, var1, var2, var3);
      if (this.getClass() != µ70.class) {
         throw new IllegalStateException();
      }
   }

   // $FF: synthetic method
   public v v(String var1, boolean var2) {
      v__ var3 = new v__(var1);
      if (var2) {
         this.v_ = v_µ.v(this.v_, var3);
         if (ig < 0) {
            throw null;
         }
      } else {
         this.µ8_ = v_µ.v(this.µ8_, var3);
      }

      return var3;
   }

   // $FF: synthetic method
   public void v(µ0 var1) {
      µ8 var2 = var1._v(this._, this.µv8, this._µv);
      if (var2 != null) {
         int var3;
         int var4;
         v__ var5;
         if (this.v_ != null) {
            var3 = C;
            var4 = this.v_.size();

            while(var3 < var4) {
               var5 = (v__)this.v_.get(var3);
               var5.v(var2.v(var5._, (boolean)i5));
               ++var3;
               if (l) {
                  throw null;
               }
            }
         }

         if (this.µ8_ != null) {
            var3 = Cu;
            var4 = this.µ8_.size();

            while(var3 < var4) {
               var5 = (v__)this.µ8_.get(var3);
               var5.v(var2.v(var5._, (boolean)Oa));
               ++var3;
               if (ig < 0) {
                  throw null;
               }
            }
         }

         v4 var6;
         if (this.µ != null) {
            var3 = w;
            var4 = this.µ.size();

            while(var3 < var4) {
               var6 = (v4)this.µ.get(var3);
               var6.v(var2.v(var6.µ, var6.µ0, var6._, (boolean)I));
               ++var3;
               if (l) {
                  throw null;
               }
            }
         }

         if (this.µ0 != null) {
            var3 = z;
            var4 = this.µ0.size();

            while(var3 < var4) {
               var6 = (v4)this.µ0.get(var3);
               var6.v(var2.v(var6.µ, var6.µ0, var6._, (boolean)w5));
               ++var3;
               if (l) {
                  throw null;
               }
            }
         }

         if (this.µv != null) {
            var3 = q;
            var4 = this.µv.size();

            while(var3 < var4) {
               var2.v((_)this.µv.get(var3));
               ++var3;
               if (ig < 0) {
                  throw null;
               }
            }
         }

         var2._v();
      }
   }

   // $FF: synthetic method
   public µ70(int var1, String var2, String var3, String var4) {
      super(var1);
      this._ = var2;
      this.µv8 = var3;
      this._µv = var4;
   }

   // $FF: synthetic method
   public void v(_ var1) {
      this.µv = v_µ.v(this.µv, var1);
   }

   // $FF: synthetic method
   public v v(int var1, µ52 var2, String var3, boolean var4) {
      v4 var5 = new v4(var1, var2, var3);
      if (var4) {
         this.µ = v_µ.v(this.µ, var5);
         if (ig < 0) {
            throw null;
         }
      } else {
         this.µ0 = v_µ.v(this.µ0, var5);
      }

      return var5;
   }
}
