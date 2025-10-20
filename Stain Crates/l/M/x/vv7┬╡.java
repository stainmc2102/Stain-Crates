package l.M.x;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class vv7µ {
   // $FF: synthetic field
   public static final int v = 0;
   // $FF: synthetic field
   public static final int _v = 1;
   // $FF: synthetic field
   public static final int _ = 2;
   // $FF: synthetic field
   public static final int µv8 = 3;
   // $FF: synthetic field
   public static final int _µv = 4;
   // $FF: synthetic field
   public static final int v_ = 5;
   // $FF: synthetic field
   public static final int µ8_ = 6;
   // $FF: synthetic field
   public static final int µ = 7;
   // $FF: synthetic field
   public static final int µ0 = 8;
   // $FF: synthetic field
   public static final int µv = 9;
   // $FF: synthetic field
   public static final int v0 = 10;
   // $FF: synthetic field
   public static final int µ6 = 11;
   // $FF: synthetic field
   public static final int µ_4 = 12;
   // $FF: synthetic field
   public static final int v8v2 = 13;
   // $FF: synthetic field
   public static final int v6 = 14;
   // $FF: synthetic field
   public static final int µ3v76 = 15;
   // $FF: synthetic field
   protected int µ5;
   // $FF: synthetic field
   public List<v4> µv56;
   // $FF: synthetic field
   public List<v4> _1;
   // $FF: synthetic field
   vv7µ _6v_v1;
   // $FF: synthetic field
   vv7µ µ_;
   // $FF: synthetic field
   int _v0;
   // $FF: synthetic field
   private static int Q;
   // $FF: synthetic field
   private static boolean WM;
   // $FF: synthetic field
   private static final int X;
   // $FF: synthetic field
   private static final int Y;
   // $FF: synthetic field
   private static final int QE;
   // $FF: synthetic field
   private static final int C;
   // $FF: synthetic field
   private static final int XF;
   // $FF: synthetic field
   private static final int H;
   // $FF: synthetic field
   private static final int G;
   // $FF: synthetic field
   private static final int V;

   static {
      int var10001 = -789250410;
      X = -1377250304 ^ 1377250303;
      int var10002 = U.o(-1483357197);
      var10001 = -1475020333;
      Y = (var10002 ^ -809260571) & -1;
      var10001 = 251673;
      QE = -2032869639 ^ U.o(528165729);
      var10002 = U.o(-673290936);
      var10001 = 454355024;
      C = var10002 ^ 312900587;
      var10002 = U.o(-134247172);
      var10001 = -678527076;
      XF = var10002 ^ 1060241391;
      var10002 = U.o(-1321937623);
      var10001 = -1237549499;
      H = var10002 ^ -1800721267;
      var10002 = U.o(-1545422437);
      var10001 = -1316097957;
      G = var10002 ^ U.N(1733423478, 815383878);
      var10002 = U.o(-1996054900);
      var10001 = -1756145727;
      V = var10002 ^ 830038161;
   }

   // $FF: synthetic method
   protected vv7µ(int var1) {
      this.µ5 = var1;
      this._v0 = X;
   }

   // $FF: synthetic method
   protected final void _v(_µ6 var1) {
      int var2;
      int var3;
      v4 var4;
      if (this.µv56 != null) {
         var2 = Y;
         var3 = this.µv56.size();

         while(var2 < var3) {
            var4 = (v4)this.µv56.get(var2);
            var4.v(var1._v(var4.µ, var4.µ0, var4._, (boolean)QE));
            ++var2;
            if (WM) {
               throw null;
            }
         }
      }

      if (this._1 != null) {
         var2 = C;
         var3 = this._1.size();

         while(var2 < var3) {
            var4 = (v4)this._1.get(var2);
            var4.v(var1._v(var4.µ, var4.µ0, var4._, (boolean)XF));
            ++var2;
            if (WM) {
               throw null;
            }
         }
      }

   }

   // $FF: synthetic method
   public vv7µ µv8() {
      return this.µ_;
   }

   // $FF: synthetic method
   public vv7µ _() {
      return this._6v_v1;
   }

   // $FF: synthetic method
   public abstract void v(_µ6 var1);

   // $FF: synthetic method
   static v_21 v(v_21 var0, Map<v_21, v_21> var1) {
      return (v_21)var1.get(var0);
   }

   // $FF: synthetic method
   static v_21[] v(List<v_21> var0, Map<v_21, v_21> var1) {
      v_21[] var2 = new v_21[var0.size()];
      int var3 = H;
      int var4 = var2.length;

      do {
         if (var3 >= var4) {
            return var2;
         }

         var2[var3] = (v_21)var1.get(var0.get(var3));
         ++var3;
      } while(!WM);

      throw null;
   }

   // $FF: synthetic method
   public abstract int _v();

   // $FF: synthetic method
   protected final vv7µ v(vv7µ var1) {
      int var2;
      int var3;
      v4 var4;
      v4 var5;
      if (var1.µv56 != null) {
         this.µv56 = new ArrayList();
         var2 = G;
         var3 = var1.µv56.size();

         while(var2 < var3) {
            var4 = (v4)var1.µv56.get(var2);
            var5 = new v4(var4.µ, var4.µ0, var4._);
            var4.v(var5);
            this.µv56.add(var5);
            ++var2;
            if (Q < 0) {
               throw null;
            }
         }
      }

      if (var1._1 != null) {
         this._1 = new ArrayList();
         var2 = V;
         var3 = var1._1.size();

         while(var2 < var3) {
            var4 = (v4)var1._1.get(var2);
            var5 = new v4(var4.µ, var4.µ0, var4._);
            var4.v(var5);
            this._1.add(var5);
            ++var2;
            if (Q < 0) {
               throw null;
            }
         }
      }

      return this;
   }

   // $FF: synthetic method
   public abstract vv7µ v(Map<v_21, v_21> var1);

   // $FF: synthetic method
   public int v() {
      return this.µ5;
   }
}
