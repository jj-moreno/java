class Statically {
  //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
  static #glue = 'Epoxy';
  jello = 'Jello';

  moveAndShake() {
    console.log('Never stagnate in life.  Be agile, change, and improve...');
  }

  static stubborn() {
    this.prototype.moveAndShake();
    console.log("Please don't make me change... I just don't like it...");
  }

  static explain() {
    this.stubborn();
    console.log(this.#glue);
    //write an explanation for how the keyword static behaves differently in javascript vs. java.
    // in javascript you can call instance methods (using this.prototype) within a static method while in java you need to create an instance (object) first of the class and then...
    // you can call the non-static method from the instance created.
    // finally I created a static getter below at the end of this class so that I could console log the glue property.
  }

  static get glue() {
    return this.#glue;
  }
}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

stats.moveAndShake();
Statically.stubborn();
Statically.explain();

console.log(Statically.glue);
console.log(stats.jello);

//Once you have finished getting statistically.js to run, refactor the code here in Java.
