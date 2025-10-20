package l.M.x;

import java.util.Arrays;

public final class v0 {
   // $FF: synthetic field
   private final String v;
   // $FF: synthetic field
   private final String _v;
   // $FF: synthetic field
   private final _1 _;
   // $FF: synthetic field
   private final Object[] µv8;
   // $FF: synthetic field
   private static String[] f;
   // $FF: synthetic field
   private static int s;
   // $FF: synthetic field
   private static boolean Y;
   // $FF: synthetic field
   private static final int p;
   // $FF: synthetic field
   private static final int u;
   // $FF: synthetic field
   private static final int g;
   // $FF: synthetic field
   private static final int E;
   // $FF: synthetic field
   private static final int n;
   // $FF: synthetic field
   private static final int H;
   // $FF: synthetic field
   private static final int o;
   // $FF: synthetic field
   private static final int q;
   // $FF: synthetic field
   private static final int l;
   // $FF: synthetic field
   private static final int Ek;
   // $FF: synthetic field
   private static final int N;
   // $FF: synthetic field
   private static final int h;
   // $FF: synthetic field
   private static final int P;
   // $FF: synthetic field
   private static final int t;
   // $FF: synthetic field
   private static final int C;
   // $FF: synthetic field
   private static final int hc;
   // $FF: synthetic field
   private static final int S;
   // $FF: synthetic field
   private static final int j;
   // $FF: synthetic field
   private static final int LA;
   // $FF: synthetic field
   private static final int gP;
   // $FF: synthetic field
   private static final int M;
   // $FF: synthetic field
   private static final int k;
   // $FF: synthetic field
   private static final int W;
   // $FF: synthetic field
   private static final int O;
   // $FF: synthetic field
   private static final int CA;
   // $FF: synthetic field
   private static final int v1;
   // $FF: synthetic field
   private static final int lo;
   // $FF: synthetic field
   private static final int l7;
   // $FF: synthetic field
   private static final int qt;
   // $FF: synthetic field
   private static final int U;
   // $FF: synthetic field
   private static final int b;
   // $FF: synthetic field
   private static final int l8;

   // $FF: synthetic method
   public int µv8() {
      return this.µv8.length;
   }

   // $FF: synthetic method
   public Object v(int var1) {
      return this.µv8[var1];
   }

   // $FF: synthetic method
   private static void V() {
      String[] var10000 = new String[hc];
      var10000[S] = L("IﾧǮ");
      f = var10000;
   }

   // $FF: synthetic method
   public String _v() {
      return this._v;
   }

   // $FF: synthetic method
   public int v_() {
      char var1 = this._v.charAt(p);
      int var10000;
      if (var1 != u && var1 != g) {
         var10000 = n;
      } else {
         var10000 = E;
         if (Y) {
            throw null;
         }
      }

      return var10000;
   }

   // $FF: synthetic method
   public v0(String var1, String var2, _1 var3, Object... var4) {
      this.v = var1;
      this._v = var2;
      this._ = var3;
      this.µv8 = var4;
   }

   // $FF: synthetic method
   public _1 _() {
      return this._;
   }

   // $FF: synthetic method
   private static String L(String n2) {
      char[] J = n2.toCharArray();
      char[] pN = new char[J.length];
      int ol = j;

      do {
         if (ol >= J.length) {
            String x = new String(pN);
            int z = U;

            do {
               if (z >= pN.length) {
                  x = new String(pN);
                  return x;
               }

               pN[z] = (char)(x.charAt(z) ^ b % l8);
               ++z;
            } while(s >= 0);

            throw null;
         }

         int var5 = ol % LA;
         if (var5 != gP) {
            if (var5 != M) {
               if (var5 != k) {
                  pN[ol] = (char)(J[ol] ^ n2.length() % qt);
               } else {
                  pN[ol] = (char)(J[ol] ^ lo % l7);
                  if (s < 0) {
                     throw null;
                  }
               }
            } else {
               pN[ol] = (char)(J[ol] ^ CA % v1);
               if (s < 0) {
                  throw null;
               }
            }
         } else {
            pN[ol] = (char)(J[ol] ^ W % O);
            if (s < 0) {
               throw null;
            }
         }

         ++ol;
      } while(!Y);

      throw null;
   }

   // $FF: synthetic method
   public boolean equals(Object var1) {
      if (var1 == this) {
         return (boolean)H;
      } else if (!(var1 instanceof v0)) {
         return (boolean)o;
      } else {
         v0 var2 = (v0)var1;
         int var10000;
         if (this.v.equals(var2.v) && this._v.equals(var2._v) && this._.equals(var2._) && Arrays.equals(this.µv8, var2.µv8)) {
            var10000 = q;
            if (Y) {
               throw null;
            }
         } else {
            var10000 = l;
         }

         return (boolean)var10000;
      }
   }

   static {
      int var10002 = l.M.x.U.o(-1990149671);
      int var10001 = -1508741723;
      p = var10002 ^ -1684207983;
      var10002 = l.M.x.U.N(1491888843, 926685365);
      var10001 = -1538109839;
      u = var10002 ^ l.M.x.U.o(-1319474490);
      g = 536870914 >>> 155 | 536870914 << ~l.M.x.U.N(-2147483571, -802307969) + 1;
      E = 2 >>> 160 | 2 << ~l.M.x.U.o(83886080) + 1;
      n = 1 >>> 96 | 1 << ~l.M.x.U.o(100663296) + 1;
      var10001 = -1013094510;
      H = 143641231 ^ l.M.x.U.o(1901326608);
      var10002 = l.M.x.U.o(860842457);
      var10001 = 1168995210;
      o = (var10002 ^ l.M.x.U.N(-591948188, -709313789)) & -1;
      var10001 = -626889017;
      q = -906644928 ^ l.M.x.U.N(-1813289853, -616148479);
      var10002 = l.M.x.U.o(-1240927949);
      var10001 = 2138189063;
      l = var10002 ^ -863039379;
      var10001 = -1887675192;
      Ek = 142620491 ^ 142620483;
      N = 262144 >>> l.M.x.U.o(1929379840) | 262144 << ~206 + 1;
      var10002 = l.M.x.U.o(-764529278);
      var10001 = 757366474;
      h = var10002 ^ 1101821523;
      var10002 = l.M.x.U.o(-83282069);
      var10001 = -1607023845;
      P = var10002 ^ -689139489;
      var10001 = 654229275;
      t = -545810089 ^ -545810057;
      var10001 = 804727095;
      C = -1445141662 ^ l.M.x.U.o(1120353173);
      var10001 = -1767278863;
      hc = (-1763855635 ^ -1763855636) & -1;
      var10002 = l.M.x.U.o(-41885351);
      var10001 = -58319890;
      S = (var10002 ^ -1702428225) & -1;
      var10002 = l.M.x.U.o(47000654);
      var10001 = -1656223782;
      j = var10002 ^ 1916056384;
      var10001 = -664195296;
      LA = (1215562270 ^ 1215562266) & -1;
      var10002 = l.M.x.U.o(-1293408429);
      var10001 = -911922450;
      gP = (var10002 ^ -891021491) & -1;
      var10002 = l.M.x.U.N(1329427744, 1277913891);
      var10001 = -1154540228;
      M = var10002 ^ 166178469;
      var10002 = l.M.x.U.o(753322660);
      var10001 = -560347155;
      k = var10002 ^ 626222902;
      var10001 = 239240263;
      W = -508481226 ^ l.M.x.U.o(-611757022);
      var10002 = l.M.x.U.o(-255281467);
      var10001 = -49934749;
      O = var10002 ^ -1553132336;
      CA = 172 >>> l.M.x.U.o(-2080374784) | 172 << ~33 + 1;
      var10002 = l.M.x.U.o(-759986281);
      var10001 = -2039566678;
      v1 = var10002 ^ -371077502;
      var10001 = -768693802;
      lo = (-1769897416 ^ l.M.x.U.o(-1861747936)) & -1;
      var10002 = l.M.x.U.o(401186581);
      var10001 = -1637566117;
      l7 = (var10002 ^ -1460038594) & -1;
      qt = 3776 >>> 66 | 3776 << ~66 + 1;
      var10002 = l.M.x.U.o(-2143210719);
      var10001 = 941972160;
      U = var10002 ^ -2066972159;
      var10002 = l.M.x.U.o(1720133383);
      var10001 = 997707270;
      b = var10002 ^ 1924826071;
      var10002 = l.M.x.U.o(1200772031);
      var10001 = -1386712561;
      l8 = var10002 ^ -37074508;
      V();
   }

   // $FF: synthetic method
   public String toString() {
      return this.v + f[P] + this._v + t + this._ + C + Arrays.toString(this.µv8);
   }

   // $FF: synthetic method
   public int hashCode() {
      return this.v.hashCode() ^ Integer.rotateLeft(this._v.hashCode(), Ek) ^ Integer.rotateLeft(this._.hashCode(), N) ^ Integer.rotateLeft(Arrays.hashCode(this.µv8), h);
   }

   // $FF: synthetic method
   public String v() {
      return this.v;
   }

   // $FF: synthetic method
   Object[] _µv() {
      return this.µv8;
   }
}
