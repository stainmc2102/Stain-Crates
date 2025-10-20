package l.M.x;

import java.util.List;

public class _µ7 extends v4 {
   // $FF: synthetic field
   public List<v_21> _µv;
   // $FF: synthetic field
   public List<v_21> v_;
   // $FF: synthetic field
   public List<Integer> µ8_;
   // $FF: synthetic field
   private static int E;
   // $FF: synthetic field
   private static final int T;
   // $FF: synthetic field
   private static final int c;

   // $FF: synthetic method
   public _µ7(int var1, µ52 var2, v_21[] var3, v_21[] var4, int[] var5, String var6) {
      this(T, var1, var2, var3, var4, var5, var6);
   }

   // $FF: synthetic method
   public _µ7(int var1, int var2, µ52 var3, v_21[] var4, v_21[] var5, int[] var6, String var7) {
      super(var1, var2, var3, var7);
      this._µv = v_µ.v((Object[])var4);
      this.v_ = v_µ.v((Object[])var5);
      this.µ8_ = v_µ.v(var6);
   }

   // $FF: synthetic method
   public void v(_µ6 var1, boolean var2) {
      µ_[] var3 = new µ_[this._µv.size()];
      µ_[] var4 = new µ_[this.v_.size()];
      int[] var5 = new int[this.µ8_.size()];
      int var6 = c;
      int var7 = var3.length;

      do {
         if (var6 >= var7) {
            this.v(var1.v(this.µ, this.µ0, var3, var4, var5, this._, var2));
            return;
         }

         var3[var6] = ((v_21)this._µv.get(var6))._µv();
         var4[var6] = ((v_21)this.v_.get(var6))._µv();
         var5[var6] = (Integer)this.µ8_.get(var6);
         ++var6;
      } while(E < 0);

      throw null;
   }

   static {
      int var10002 = U.N(796039526, 1222753326);
      int var10001 = -394767591;
      T = var10002 ^ 1704050122;
      var10002 = U.o(1620402890);
      var10001 = -379352415;
      c = (var10002 ^ 1397139718) & -1;
   }
}
