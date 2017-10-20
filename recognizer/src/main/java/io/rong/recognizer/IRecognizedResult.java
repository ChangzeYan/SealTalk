package io.rong.recognizer;


public interface IRecognizedResult {
    void onResult(String data);
    void onClearClick();
}
