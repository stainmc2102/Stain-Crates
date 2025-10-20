package l.M.x;

import java.util.Iterator;
import java.util.ListIterator;

public class _13 implements Iterable<vv7µ> {
   // $FF: synthetic field
   private int _v;
   // $FF: synthetic field
   private vv7µ _;
   // $FF: synthetic field
   private vv7µ µv8;
   // $FF: synthetic field
   vv7µ[] v;
   // $FF: synthetic field
   private static int K;
   // $FF: synthetic field
   private static boolean w;
   // $FF: synthetic field
   private static final int P;
   // $FF: synthetic field
   private static final int y;
   // $FF: synthetic field
   private static final int f;
   // $FF: synthetic field
   private static final int B;
   // $FF: synthetic field
   private static final int y8;
   // $FF: synthetic field
   private static final int Q;
   // $FF: synthetic field
   private static final int h;
   // $FF: synthetic field
   private static final int A;
   // $FF: synthetic field
   private static final int R;
   // $FF: synthetic field
   private static final int fO;
   // $FF: synthetic field
   private static final int N;
   // $FF: synthetic field
   private static final int t;
   // $FF: synthetic field
   private static final int D;
   // $FF: synthetic field
   private static final int T;
   // $FF: synthetic field
   private static final int J;
   // $FF: synthetic field
   private static final int H;
   // $FF: synthetic field
   private static final int s;
   // $FF: synthetic field
   private static final int r;
   // $FF: synthetic field
   private static final int b;
   // $FF: synthetic field
   private static final int S;
   // $FF: synthetic field
   private static final int c;
   // $FF: synthetic field
   private static final int m;
   // $FF: synthetic field
   private static final int a;

   // $FF: synthetic method
   public void v(vv7µ var1, _13 var2) {
      if (var2._v != 0) {
         this._v += var2._v;
         vv7µ var3 = var2._;
         vv7µ var4 = var2.µv8;
         vv7µ var5 = var1.µ_;
         if (var5 == null) {
            this.µv8 = var4;
            if (K < 0) {
               throw null;
            }
         } else {
            var5._6v_v1 = var4;
         }

         var1.µ_ = var3;
         var4.µ_ = var5;
         var3._6v_v1 = var1;
         this.v = null;
         var2.v((boolean)J);
      }
   }

   // $FF: synthetic method
   public vv7µ v(int var1) {
      if (var1 >= 0 && var1 < this._v) {
         if (this.v == null) {
            this.v = this._µv();
         }

         return this.v[var1];
      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   // $FF: synthetic method
   public vv7µ[] _µv() {
      int var1 = B;
      vv7µ var2 = this._;
      vv7µ[] var3 = new vv7µ[this._v];

      do {
         if (var2 == null) {
            return var3;
         }

         var3[var1] = var2;
         var2._v0 = var1++;
         var2 = var2.µ_;
      } while(K >= 0);

      throw null;
   }

   // $FF: synthetic method
   public void v(_µ6 var1) {
      vv7µ var2 = this._;

      do {
         if (var2 == null) {
            return;
         }

         var2.v(var1);
         var2 = var2.µ_;
      } while(!w);

      throw null;
   }

   // $FF: synthetic method
   public void _v(vv7µ var1, _13 var2) {
      if (var2._v != 0) {
         this._v += var2._v;
         vv7µ var3 = var2._;
         vv7µ var4 = var2.µv8;
         vv7µ var5 = var1._6v_v1;
         if (var5 == null) {
            this._ = var3;
            if (w) {
               throw null;
            }
         } else {
            var5.µ_ = var3;
         }

         var1._6v_v1 = var4;
         var4.µ_ = var1;
         var3._6v_v1 = var5;
         this.v = null;
         var2.v((boolean)r);
      }
   }

   // $FF: synthetic method
   public void v_() {
      this.v((boolean)a);
   }

   // $FF: synthetic method
   public ListIterator<vv7µ> _v(int var1) {
      return new v_v(this, var1);
   }

   // $FF: synthetic method
   public int _v(vv7µ var1) {
      if (this.v == null) {
         this.v = this._µv();
      }

      return var1._v0;
   }

   // $FF: synthetic method
   void v(boolean var1) {
      if (var1) {
         vv7µ var2 = this._;

         while(var2 != null) {
            vv7µ var3 = var2.µ_;
            var2._v0 = c;
            var2._6v_v1 = null;
            var2.µ_ = null;
            var2 = var3;
            if (w) {
               throw null;
            }
         }
      }

      this._v = m;
      this._ = null;
      this.µv8 = null;
      this.v = null;
   }

   // $FF: synthetic method
   public void _(vv7µ var1) {
      this._v += h;
      if (this.µv8 == null) {
         this._ = var1;
         this.µv8 = var1;
         if (K < 0) {
            throw null;
         }
      } else {
         this.µv8.µ_ = var1;
         var1._6v_v1 = this.µv8;
      }

      this.µv8 = var1;
      this.v = null;
      var1._v0 = A;
   }

   // $FF: synthetic method
   public void v(_13 var1) {
      if (var1._v != 0) {
         this._v += var1._v;
         if (this.µv8 == null) {
            this._ = var1._;
            this.µv8 = var1.µv8;
            if (K < 0) {
               throw null;
            }
         } else {
            vv7µ var2 = var1._;
            this.µv8.µ_ = var2;
            var2._6v_v1 = this.µv8;
            this.µv8 = var1.µv8;
         }

         this.v = null;
         var1.v((boolean)R);
      }
   }

   // $FF: synthetic method
   public ListIterator<vv7µ> µv8() {
      return this._v(f);
   }

   // $FF: synthetic method
   public int v() {
      return this._v;
   }

   static {
      int var10002 = U.o(-92887208);
      int var10001 = 310955632;
      P = var10002 ^ 451243614;
      var10002 = U.N(-1817684635, -255625129);
      var10001 = 146967823;
      y = var10002 ^ U.N(1353370407, -625720416);
      var10002 = U.o(-835886754);
      var10001 = 155219861;
      f = var10002 ^ 2055648371;
      var10002 = U.o(-117648218);
      var10001 = 5306901;
      B = var10002 ^ 1697333023;
      var10002 = U.o(-1848175532);
      var10001 = -718942616;
      y8 = var10002 ^ 707324809;
      var10002 = U.o(-241786336);
      var10001 = 756574587;
      Q = (var10002 ^ -71657872) & -1;
      h = 16 >>> U.o(587202560) | 16 << ~196 + 1;
      var10002 = U.o(-1944439416);
      var10001 = 483313999;
      A = var10002 ^ U.N(1656850573, 1571208971);
      var10002 = U.o(1663056275);
      var10001 = 1333384158;
      R = var10002 ^ -912522042;
      var10002 = U.o(2022148171);
      var10001 = 1851892463;
      fO = (var10002 ^ -770580193) & -1;
      var10002 = U.o(-437998502);
      var10001 = -2087852840;
      N = var10002 ^ U.N(-695383575, 1623061982);
      var10002 = U.o(1430795027);
      var10001 = -1073887075;
      t = var10002 ^ -926149974;
      D = (16777216 >>> U.o(520093696) | 16777216 << ~248 + 1) & -1;
      var10002 = U.o(473779251);
      var10001 = -771273602;
      T = var10002 ^ -869090248;
      var10002 = U.o(-1123215739);
      var10001 = -681349028;
      J = var10002 ^ -1586974531;
      H = 128 >>> 39 | 128 << -39;
      var10002 = U.o(-1720515209);
      var10001 = -1968032640;
      s = var10002 ^ -291451239;
      var10002 = U.o(1249943230);
      var10001 = 9479581;
      r = var10002 ^ 2105082194;
      b = 524288 >>> 211 | 524288 << ~U.N(432128, -130907669) + 1;
      var10001 = -1452139236;
      S = -4068186 ^ U.o(-1698137088);
      var10002 = U.o(-605148343);
      var10001 = 1007046317;
      c = (var10002 ^ 1831569444) & -1;
      var10002 = U.o(-103032258);
      var10001 = 170302499;
      m = (var10002 ^ 2086394783) & -1;
      var10002 = U.o(-1860462221);
      var10001 = -1763797027;
      a = (var10002 ^ U.N(658138978, 1187337274)) & -1;
   }

   // $FF: synthetic method
   public void v(vv7µ var1, vv7µ var2) {
      vv7µ var3 = var1.µ_;
      var2.µ_ = var3;
      if (var3 != null) {
         var3._6v_v1 = var2;
         if (w) {
            throw null;
         }
      } else {
         this.µv8 = var2;
      }

      vv7µ var4 = var1._6v_v1;
      var2._6v_v1 = var4;
      if (var4 != null) {
         var4.µ_ = var2;
         if (K < 0) {
            throw null;
         }
      } else {
         this._ = var2;
      }

      if (this.v != null) {
         int var5 = var1._v0;
         this.v[var5] = var2;
         var2._v0 = var5;
         if (K < 0) {
            throw null;
         }
      } else {
         var2._v0 = y8;
      }

      var1._v0 = Q;
      var1._6v_v1 = null;
      var1.µ_ = null;
   }

   // $FF: synthetic method
   public Iterator iterator() {
      return this.µv8();
   }

   // $FF: synthetic method
   public void µ8_() {
      vv7µ var1 = this._;

      do {
         if (var1 == null) {
            return;
         }

         if (var1 instanceof v_21) {
            ((v_21)var1).v_();
         }

         var1 = var1.µ_;
      } while(K >= 0);

      throw null;
   }

   // $FF: synthetic method
   public void _(vv7µ var1, vv7µ var2) {
      this._v += H;
      vv7µ var3 = var1._6v_v1;
      if (var3 == null) {
         this._ = var2;
         if (K < 0) {
            throw null;
         }
      } else {
         var3.µ_ = var2;
      }

      var1._6v_v1 = var2;
      var2.µ_ = var1;
      var2._6v_v1 = var3;
      this.v = null;
      var2._v0 = s;
   }

   // $FF: synthetic method
   public boolean v(vv7µ var1) {
      vv7µ var2 = this._;

      while(var2 != null && var2 != var1) {
         var2 = var2.µ_;
         if (w) {
            throw null;
         }
      }

      int var10000;
      if (var2 != null) {
         var10000 = P;
         if (w) {
            throw null;
         }
      } else {
         var10000 = y;
      }

      return (boolean)var10000;
   }

   // $FF: synthetic method
   public void µv8(vv7µ var1) {
      this._v += fO;
      if (this._ == null) {
         this._ = var1;
         this.µv8 = var1;
         if (K < 0) {
            throw null;
         }
      } else {
         this._._6v_v1 = var1;
         var1.µ_ = this._;
      }

      this._ = var1;
      this.v = null;
      var1._v0 = N;
   }

   // $FF: synthetic method
   public void _v(vv7µ var1, vv7µ var2) {
      this._v += D;
      vv7µ var3 = var1.µ_;
      if (var3 == null) {
         this.µv8 = var2;
         if (w) {
            throw null;
         }
      } else {
         var3._6v_v1 = var2;
      }

      var1.µ_ = var2;
      var2.µ_ = var3;
      var2._6v_v1 = var1;
      this.v = null;
      var2._v0 = T;
   }

   // $FF: synthetic method
   public vv7µ _v() {
      return this._;
   }

   // $FF: synthetic method
   public void _µv(vv7µ var1) {
      this._v -= b;
      vv7µ var2 = var1.µ_;
      vv7µ var3 = var1._6v_v1;
      if (var2 == null) {
         if (var3 == null) {
            this._ = null;
            this.µv8 = null;
            if (K < 0) {
               throw null;
            }
         } else {
            var3.µ_ = null;
            this.µv8 = var3;
            if (K < 0) {
               throw null;
            }
         }
      } else if (var3 == null) {
         this._ = var2;
         var2._6v_v1 = null;
         if (K < 0) {
            throw null;
         }
      } else {
         var3.µ_ = var2;
         var2._6v_v1 = var3;
      }

      this.v = null;
      var1._v0 = S;
      var1._6v_v1 = null;
      var1.µ_ = null;
   }

   // $FF: synthetic method
   public vv7µ _() {
      return this.µv8;
   }

   // $FF: synthetic method
   public void _v(_13 var1) {
      if (var1._v != 0) {
         this._v += var1._v;
         if (this._ == null) {
            this._ = var1._;
            this.µv8 = var1.µv8;
            if (w) {
               throw null;
            }
         } else {
            vv7µ var2 = var1.µv8;
            this._._6v_v1 = var2;
            var2.µ_ = this._;
            this._ = var1._;
         }

         this.v = null;
         var1.v((boolean)t);
      }
   }
}
