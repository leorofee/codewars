""" '[name] said: "[quote]"'
For example, if name is 'Grae' and 'quote' is 'Practice makes perfect' then your function should return the string
'Grae said: "Practice makes perfect"'
Unfortunately, something is wrong with the instructions in the function body. Your job is to fix it so the function returns correctly formatted quotes.
def quotable(name, quote):
    return name + quote + '"'
"""
def quotable(name, quote):
    return name +" said: " + '"'+ quote +'"'