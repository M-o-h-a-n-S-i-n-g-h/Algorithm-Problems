const computeFine = (cars, penalties, date) => {
  let fine = 0;
  if (!(date & 1)) {
    cars.forEach((car, index) => (car & 1 ? (fine += penalties[index]) : ""));
    return fine;
  } else {
    cars.forEach((car, index) =>
      !(car & 1) ? (fine += penalties[index]) : ""
    );
    return fine;
  }
};

const cars = [2222, 2223, 2224];
const penalties = [200, 300, 400];
const date = 8;

const result = computeFine(cars, penalties, date);
console.log(result);

// class Findfine {
//   constructor(cars, penalties, date) {
//     this.cars = cars;
//     this.penalties = penalties;
//     this.date = date;
//   }
//   computeFine() {
//     console.log("I ran");
//     let fine = 0;
//     if (date & 0) {
//       console.log("Even");
//       return cars.forEach((car, index) =>
//         car & 1 ? (fine += penalties[index]) : ""
//       );
//     } else if (date & 1) {
//       console.log("Odd");
//       return cars.forEach((car, index) =>
//         car & 0 ? (fine += penalties[index]) : ""
//       );
//     }
//     return fine;
//   }
// }

// const cars = [1, 4, 3, 7, 6];
// const penalties = [200, 300, 400, 500];
// const date = 14;
// const a = new Findfine(cars, penalties, date);
// console.log(a.computeFine());
