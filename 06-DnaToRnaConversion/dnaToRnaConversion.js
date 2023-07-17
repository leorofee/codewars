   // create a function which returns an RNA sequence from the given DNA sequence. Ex: "GCAT"  =>  "GCAU"

function DNAtoRNA(dna) {
    let rna = dna.replace(/T/g, "U")
    return rna
  }