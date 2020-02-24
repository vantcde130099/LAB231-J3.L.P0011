console.log('ok');
function trimSentence(str, sentenceCount){
        var strArray = str.split('.');
        var subArray = strArray.slice(0, sentenceCount);
    var result = subArray.join(".");
    return result + '...';
}

var str = $('article .content').text();
var result = trimSentence(str, 4);
$('article .content').text(result);