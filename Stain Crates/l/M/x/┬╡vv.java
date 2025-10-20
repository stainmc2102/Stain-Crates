package l.M.x;

import java.util.List;
import java.util.Map;

public class µvv extends vv7µ {
   // $FF: synthetic field
   public v_21 _µ6;
   // $FF: synthetic field
   public List<Integer> __;
   // $FF: synthetic field
   public List<v_21> v_5;
   // $FF: synthetic field
   private static int td;
   // $FF: synthetic field
   private static boolean i;
   // $FF: synthetic field
   private static final int F = 700416 >>> U.o(872415232) | 700416 << ~44 + 1;
   // $FF: synthetic field
   private static final int B;
   // $FF: synthetic field
   private static final int X;
   // $FF: synthetic field
   private static final int k;

   // $FF: synthetic method
   public void v(_µ6 var1) {
      int[] var2 = new int[this.__.size()];
      int var3 = X;
      int var4 = var2.length;

      do {
         if (var3 >= var4) {
            µ_[] var6 = new µ_[this.v_5.size()];
            var4 = k;
            int var5 = var6.length;

            do {
               if (var4 >= var5) {
                  var1.v(this._µ6._µv(), var2, var6);
                  this._v(var1);
                  return;
               }

               var6[var4] = ((v_21)this.v_5.get(var4))._µv();
               ++var4;
            } while(i);

            throw null;
         }

         var2[var3] = (Integer)this.__.get(var3);
         ++var3;
      } while(td < 0);

      throw null;
   }

   // $FF: synthetic method
   public µvv(v_21 var1, int[] var2, v_21[] var3) {
      super(F);
      this._µ6 = var1;
      this.__ = v_µ.v(var2);
      this.v_5 = v_µ.v((Object[])var3);
   }

   // $FF: synthetic method
   public vv7µ v(Map<v_21, v_21> var1) {
      µvv var2 = new µvv(v(this._µ6, var1), (int[])null, v(this.v_5, var1));
      var2.__.addAll(this.__);
      return var2.v((vv7µ)this);
   }

   // $FF: synthetic method
   public int _v() {
      return B;
   }

   static {
      int var10001 = 847195912;
      B = -697648488 ^ -697648492;
      int var10002 = U.N(-769155172, -1606052068);
      var10001 = 881212028;
      X = var10002 ^ U.o(-1281384892);
      var10002 = U.o(-1676200865);
      var10001 = 1764881203;
      k = var10002 ^ -97720263;
   }
}
