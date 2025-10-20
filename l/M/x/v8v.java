package l.M.x;

import java.util.List;
import java.util.Map;

public class v8v extends vv7µ {
   // $FF: synthetic field
   public int _µ6;
   // $FF: synthetic field
   public int __;
   // $FF: synthetic field
   public v_21 v_5;
   // $FF: synthetic field
   public List<v_21> _72;
   // $FF: synthetic field
   private static int y;
   // $FF: synthetic field
   private static final int m = 5570560 >>> 79 | 5570560 << ~79 + 1;
   // $FF: synthetic field
   private static final int V;
   // $FF: synthetic field
   private static final int N;

   static {
      int var10002 = U.o(-431278160);
      int var10001 = 1060563716;
      V = var10002 ^ 233624172;
      var10002 = U.o(-1520243063);
      var10001 = 1622464082;
      N = var10002 ^ -1854454107;
   }

   // $FF: synthetic method
   public void v(_µ6 var1) {
      µ_[] var2 = new µ_[this._72.size()];
      int var3 = N;
      int var4 = var2.length;

      do {
         if (var3 >= var4) {
            var1.v(this._µ6, this.__, this.v_5._µv(), var2);
            this._v(var1);
            return;
         }

         var2[var3] = ((v_21)this._72.get(var3))._µv();
         ++var3;
      } while(y >= 0);

      throw null;
   }

   // $FF: synthetic method
   public vv7µ v(Map<v_21, v_21> var1) {
      return (new v8v(this._µ6, this.__, v(this.v_5, var1), v(this._72, var1))).v((vv7µ)this);
   }

   // $FF: synthetic method
   public v8v(int var1, int var2, v_21 var3, v_21... var4) {
      super(m);
      this._µ6 = var1;
      this.__ = var2;
      this.v_5 = var3;
      this._72 = v_µ.v((Object[])var4);
   }

   // $FF: synthetic method
   public int _v() {
      return V;
   }
}
