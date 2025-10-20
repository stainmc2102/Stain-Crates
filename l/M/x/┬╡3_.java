package l.M.x;

import java.util.List;

public class µ3_ {
   // $FF: synthetic field
   public v_21 v;
   // $FF: synthetic field
   public v_21 _v;
   // $FF: synthetic field
   public v_21 _;
   // $FF: synthetic field
   public String µv8;
   // $FF: synthetic field
   public List<v4> _µv;
   // $FF: synthetic field
   public List<v4> v_;
   // $FF: synthetic field
   private static int q;
   // $FF: synthetic field
   private static boolean B;
   // $FF: synthetic field
   private static final int x = 540672 >>> 21 | 540672 << ~21 + 1;
   // $FF: synthetic field
   private static final int T = (4194304 >>> 179 | 4194304 << ~U.o(-855638016) + 1) & -1;
   // $FF: synthetic field
   private static final int L;
   // $FF: synthetic field
   private static final int G;
   // $FF: synthetic field
   private static final int c;
   // $FF: synthetic field
   private static final int a;
   // $FF: synthetic field
   private static final int Z;
   // $FF: synthetic field
   private static final int f;

   // $FF: synthetic method
   public µ3_(v_21 var1, v_21 var2, v_21 var3, String var4) {
      this.v = var1;
      this._v = var2;
      this._ = var3;
      this.µv8 = var4;
   }

   // $FF: synthetic method
   public void v(_µ6 var1) {
      µ_ var10001 = this.v._µv();
      µ_ var10002 = this._v._µv();
      µ_ var10003;
      if (this._ == null) {
         var10003 = null;
         if (q < 0) {
            throw null;
         }
      } else {
         var10003 = this._._µv();
      }

      var1.v(var10001, var10002, var10003, this.µv8);
      int var2;
      int var3;
      v4 var4;
      if (this._µv != null) {
         var2 = c;
         var3 = this._µv.size();

         while(var2 < var3) {
            var4 = (v4)this._µv.get(var2);
            var4.v(var1._(var4.µ, var4.µ0, var4._, (boolean)a));
            ++var2;
            if (!B) {
               throw null;
            }
         }
      }

      if (this.v_ != null) {
         var2 = Z;
         var3 = this.v_.size();

         while(var2 < var3) {
            var4 = (v4)this.v_.get(var2);
            var4.v(var1._(var4.µ, var4.µ0, var4._, (boolean)f));
            ++var2;
            if (q < 0) {
               throw null;
            }
         }
      }

   }

   static {
      int var10002 = U.o(-1019324064);
      int var10001 = 1186712501;
      L = (var10002 ^ U.N(-1046044880, -32631490)) & -1;
      var10002 = U.N(1674824349, 1288996275);
      var10001 = 1793825515;
      G = var10002 ^ 2035526778;
      var10002 = U.o(-278961728);
      var10001 = 1708022019;
      c = var10002 ^ 59177719;
      a = 2 >>> U.o(-2063597568) | 2 << ~161 + 1;
      var10002 = U.o(-1532354184);
      var10001 = -1545119909;
      Z = var10002 ^ 511989029;
      var10002 = U.o(-762501929);
      var10001 = -1039106512;
      f = var10002 ^ -349916853;
   }

   // $FF: synthetic method
   public void v(int var1) {
      int var2 = x | var1 << T;
      int var3;
      int var4;
      if (this._µv != null) {
         var3 = L;
         var4 = this._µv.size();

         while(var3 < var4) {
            ((v4)this._µv.get(var3)).µ = var2;
            ++var3;
            if (!B) {
               throw null;
            }
         }
      }

      if (this.v_ != null) {
         var3 = G;
         var4 = this.v_.size();

         while(var3 < var4) {
            ((v4)this.v_.get(var3)).µ = var2;
            ++var3;
            if (q < 0) {
               throw null;
            }
         }
      }

   }
}
