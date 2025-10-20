package l.M.x;

import java.util.ListIterator;
import java.util.NoSuchElementException;

final class v_v implements ListIterator {
   // $FF: synthetic field
   vv7µ v;
   // $FF: synthetic field
   vv7µ _v;
   // $FF: synthetic field
   vv7µ _;
   // $FF: synthetic field
   final _13 µv8;
   // $FF: synthetic field
   private static int s;
   // $FF: synthetic field
   private static boolean x;
   // $FF: synthetic field
   private static final int x7;
   // $FF: synthetic field
   private static final int V;
   // $FF: synthetic field
   private static final int C;
   // $FF: synthetic field
   private static final int Q;
   // $FF: synthetic field
   private static final int sh;
   // $FF: synthetic field
   private static final int T;

   static {
      int var10002 = U.o(605891090);
      int var10001 = 141111427;
      x7 = var10002 ^ 1213511716;
      var10002 = U.o(903463275);
      var10001 = -426749295;
      V = var10002 ^ -696018003;
      var10002 = U.o(1378480293);
      var10001 = -1226469542;
      C = var10002 ^ -1525705654;
      Q = 512 >>> U.o(-1862270976) | 512 << ~137 + 1;
      var10002 = U.o(1828565020);
      var10001 = -458727347;
      sh = var10002 ^ U.N(-423165513, 1370621653);
      T = -1 >>> U.o(301989888) | -1 << ~72 + 1;
   }

   // $FF: synthetic method
   public boolean hasPrevious() {
      int var10000;
      if (this._v != null) {
         var10000 = Q;
         if (x) {
            throw null;
         }
      } else {
         var10000 = sh;
      }

      return (boolean)var10000;
   }

   // $FF: synthetic method
   public boolean hasNext() {
      int var10000;
      if (this.v != null) {
         var10000 = V;
         if (x) {
            throw null;
         }
      } else {
         var10000 = C;
      }

      return (boolean)var10000;
   }

   // $FF: synthetic method
   public void remove() {
      if (this._ != null) {
         if (this._ == this.v) {
            this.v = this.v.µ_;
            if (x) {
               throw null;
            }
         } else {
            this._v = this._v._6v_v1;
         }

         this.µv8._µv(this._);
         this._ = null;
         if (s >= 0) {
            throw null;
         }
      } else {
         throw new IllegalStateException();
      }
   }

   // $FF: synthetic method
   public Object previous() {
      if (this._v == null) {
         throw new NoSuchElementException();
      } else {
         vv7µ var1 = this._v;
         this.v = var1;
         this._v = var1._6v_v1;
         this._ = var1;
         return var1;
      }
   }

   // $FF: synthetic method
   v_v(_13 var1, int var2) {
      this.µv8 = var1;
      if (var2 >= 0 && var2 <= var1.v()) {
         if (var2 == var1.v()) {
            this.v = null;
            this._v = var1._();
            if (s >= 0) {
               throw null;
            }
         } else {
            vv7µ var3 = var1._v();
            int var4 = x7;

            while(var4 < var2) {
               var3 = var3.µ_;
               ++var4;
               if (s >= 0) {
                  throw null;
               }
            }

            this.v = var3;
            this._v = var3._6v_v1;
         }

      } else {
         throw new IndexOutOfBoundsException();
      }
   }

   // $FF: synthetic method
   public Object next() {
      if (this.v == null) {
         throw new NoSuchElementException();
      } else {
         vv7µ var1 = this.v;
         this._v = var1;
         this.v = var1.µ_;
         this._ = var1;
         return var1;
      }
   }

   // $FF: synthetic method
   public void set(Object var1) {
      if (this._ != null) {
         this.µv8.v(this._, (vv7µ)var1);
         if (this._ == this._v) {
            this._v = (vv7µ)var1;
            if (s >= 0) {
               throw null;
            }
         } else {
            this.v = (vv7µ)var1;
            if (s >= 0) {
               throw null;
            }
         }

      } else {
         throw new IllegalStateException();
      }
   }

   // $FF: synthetic method
   public void add(Object var1) {
      if (this.v != null) {
         this.µv8._(this.v, (vv7µ)var1);
         if (s >= 0) {
            throw null;
         }
      } else if (this._v != null) {
         this.µv8._v(this._v, (vv7µ)var1);
         if (s >= 0) {
            throw null;
         }
      } else {
         this.µv8._((vv7µ)var1);
      }

      this._v = (vv7µ)var1;
      this._ = null;
   }

   // $FF: synthetic method
   public int nextIndex() {
      if (this.v == null) {
         return this.µv8.v();
      } else {
         if (this.µv8.v == null) {
            this.µv8.v = this.µv8._µv();
         }

         return this.v._v0;
      }
   }

   // $FF: synthetic method
   public int previousIndex() {
      if (this._v == null) {
         return T;
      } else {
         if (this.µv8.v == null) {
            this.µv8.v = this.µv8._µv();
         }

         return this._v._v0;
      }
   }
}
