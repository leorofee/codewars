""" Create a function that takes 2 integers in form of a string as an input, and outputs the sum


    If either input is an empty string, consider it as zero.

    Inputs and the expected output will never exceed the signed 32-bit integer limit (2^31 - 1) """


def sum_str(a, b):
    if a =='' and b == '':
        return '0'
    elif a == '' and b !='':
        return str(b)
    elif b == '' and a !='':
        return str(a)
    else:
        return str(int (a) + int(b))
    