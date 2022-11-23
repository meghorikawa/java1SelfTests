A stemmer that will give the stem of a word input based on the algorithm below: 


Here is a simple algorithm (based on M.F. Porter 1980 "An algorithm for suffix stripping", Program 14, 130--137) for part of the stemming problem: that it removes only inflectional endings (things like "-ed" and "-ing" but not things like "-al" and "-tion") from English words.

    If the word ends in "ing" and is longer than 4 letters, remove the "ing".
    If the word ends in "sses", remove the final "es".
    If the word ends in "ies", replace the "ies" with "y".
    If the word ends in "s", but not in "sses", "ies", or "ss", then remove the final "s".
    If the word ends in "eed" and is longer than 4 letters, remove the final "d".
    If the word ends in "ed" but not in "eed" and is longer than 4 letters, remove the final "ed".
