package org.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.services.GuixDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGuixDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Module'", "'{'", "'hint'", "'='", "'}'", "'View'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'=>'", "'<>'", "'?:'", "'<=>'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'.'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "';'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'var'", "'val'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'?'", "'extends'", "'&'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int RULE_HEX=6;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalGuixDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuixDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuixDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g"; }



     	private GuixDslGrammarAccess grammarAccess;
     	
        public InternalGuixDslParser(TokenStream input, GuixDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DslModel";	
       	}
       	
       	@Override
       	protected GuixDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDslModel"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:67:1: entryRuleDslModel returns [EObject current=null] : iv_ruleDslModel= ruleDslModel EOF ;
    public final EObject entryRuleDslModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDslModel = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:68:2: (iv_ruleDslModel= ruleDslModel EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:69:2: iv_ruleDslModel= ruleDslModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDslModelRule()); 
            }
            pushFollow(FOLLOW_ruleDslModel_in_entryRuleDslModel75);
            iv_ruleDslModel=ruleDslModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDslModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDslModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDslModel"


    // $ANTLR start "ruleDslModel"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:76:1: ruleDslModel returns [EObject current=null] : ( (lv_elements_0_0= ruleDslAbstractGuiElement ) )* ;
    public final EObject ruleDslModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:79:28: ( ( (lv_elements_0_0= ruleDslAbstractGuiElement ) )* )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:80:1: ( (lv_elements_0_0= ruleDslAbstractGuiElement ) )*
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:80:1: ( (lv_elements_0_0= ruleDslAbstractGuiElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_STRING||LA1_0==13||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:81:1: (lv_elements_0_0= ruleDslAbstractGuiElement )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:81:1: (lv_elements_0_0= ruleDslAbstractGuiElement )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:82:3: lv_elements_0_0= ruleDslAbstractGuiElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDslModelAccess().getElementsDslAbstractGuiElementParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDslAbstractGuiElement_in_ruleDslModel130);
            	    lv_elements_0_0=ruleDslAbstractGuiElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDslModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_0_0, 
            	              		"DslAbstractGuiElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDslModel"


    // $ANTLR start "entryRuleDslAbstractGuiElement"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:106:1: entryRuleDslAbstractGuiElement returns [EObject current=null] : iv_ruleDslAbstractGuiElement= ruleDslAbstractGuiElement EOF ;
    public final EObject entryRuleDslAbstractGuiElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDslAbstractGuiElement = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:107:2: (iv_ruleDslAbstractGuiElement= ruleDslAbstractGuiElement EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:108:2: iv_ruleDslAbstractGuiElement= ruleDslAbstractGuiElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDslAbstractGuiElementRule()); 
            }
            pushFollow(FOLLOW_ruleDslAbstractGuiElement_in_entryRuleDslAbstractGuiElement166);
            iv_ruleDslAbstractGuiElement=ruleDslAbstractGuiElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDslAbstractGuiElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDslAbstractGuiElement176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDslAbstractGuiElement"


    // $ANTLR start "ruleDslAbstractGuiElement"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:115:1: ruleDslAbstractGuiElement returns [EObject current=null] : (this_DslGuiModule_0= ruleDslGuiModule | this_DslView_1= ruleDslView ) ;
    public final EObject ruleDslAbstractGuiElement() throws RecognitionException {
        EObject current = null;

        EObject this_DslGuiModule_0 = null;

        EObject this_DslView_1 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:118:28: ( (this_DslGuiModule_0= ruleDslGuiModule | this_DslView_1= ruleDslView ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:119:1: (this_DslGuiModule_0= ruleDslGuiModule | this_DslView_1= ruleDslView )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:119:1: (this_DslGuiModule_0= ruleDslGuiModule | this_DslView_1= ruleDslView )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==18) ) {
                    alt2=2;
                }
                else if ( (LA2_1==13) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                alt2=1;
                }
                break;
            case 18:
                {
                alt2=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:120:5: this_DslGuiModule_0= ruleDslGuiModule
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDslAbstractGuiElementAccess().getDslGuiModuleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDslGuiModule_in_ruleDslAbstractGuiElement223);
                    this_DslGuiModule_0=ruleDslGuiModule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DslGuiModule_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:130:5: this_DslView_1= ruleDslView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDslAbstractGuiElementAccess().getDslViewParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDslView_in_ruleDslAbstractGuiElement250);
                    this_DslView_1=ruleDslView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DslView_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDslAbstractGuiElement"


    // $ANTLR start "entryRuleDslGuiModule"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:146:1: entryRuleDslGuiModule returns [EObject current=null] : iv_ruleDslGuiModule= ruleDslGuiModule EOF ;
    public final EObject entryRuleDslGuiModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDslGuiModule = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:147:2: (iv_ruleDslGuiModule= ruleDslGuiModule EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:148:2: iv_ruleDslGuiModule= ruleDslGuiModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDslGuiModuleRule()); 
            }
            pushFollow(FOLLOW_ruleDslGuiModule_in_entryRuleDslGuiModule285);
            iv_ruleDslGuiModule=ruleDslGuiModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDslGuiModule; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDslGuiModule295); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDslGuiModule"


    // $ANTLR start "ruleDslGuiModule"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:155:1: ruleDslGuiModule returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_STRING ) )? otherlv_1= 'Module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'hint' otherlv_5= '=' ( (lv_hint_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleDslGuiModule() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_hint_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:158:28: ( ( ( (lv_documentation_0_0= RULE_STRING ) )? otherlv_1= 'Module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'hint' otherlv_5= '=' ( (lv_hint_6_0= RULE_STRING ) ) )? otherlv_7= '}' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:159:1: ( ( (lv_documentation_0_0= RULE_STRING ) )? otherlv_1= 'Module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'hint' otherlv_5= '=' ( (lv_hint_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:159:1: ( ( (lv_documentation_0_0= RULE_STRING ) )? otherlv_1= 'Module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'hint' otherlv_5= '=' ( (lv_hint_6_0= RULE_STRING ) ) )? otherlv_7= '}' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:159:2: ( (lv_documentation_0_0= RULE_STRING ) )? otherlv_1= 'Module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'hint' otherlv_5= '=' ( (lv_hint_6_0= RULE_STRING ) ) )? otherlv_7= '}'
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:159:2: ( (lv_documentation_0_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:160:1: (lv_documentation_0_0= RULE_STRING )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:160:1: (lv_documentation_0_0= RULE_STRING )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:161:3: lv_documentation_0_0= RULE_STRING
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDslGuiModule337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_documentation_0_0, grammarAccess.getDslGuiModuleAccess().getDocumentationSTRINGTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDslGuiModuleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"documentation",
                              		lv_documentation_0_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleDslGuiModule355); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDslGuiModuleAccess().getModuleKeyword_1());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:181:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:182:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:182:1: (lv_name_2_0= RULE_ID )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:183:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDslGuiModule372); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDslGuiModuleAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDslGuiModuleRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDslGuiModule389); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDslGuiModuleAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:203:1: (otherlv_4= 'hint' otherlv_5= '=' ( (lv_hint_6_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:203:3: otherlv_4= 'hint' otherlv_5= '=' ( (lv_hint_6_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDslGuiModule402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDslGuiModuleAccess().getHintKeyword_4_0());
                          
                    }
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleDslGuiModule414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getDslGuiModuleAccess().getEqualsSignKeyword_4_1());
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:211:1: ( (lv_hint_6_0= RULE_STRING ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:212:1: (lv_hint_6_0= RULE_STRING )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:212:1: (lv_hint_6_0= RULE_STRING )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:213:3: lv_hint_6_0= RULE_STRING
                    {
                    lv_hint_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDslGuiModule431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_hint_6_0, grammarAccess.getDslGuiModuleAccess().getHintSTRINGTerminalRuleCall_4_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDslGuiModuleRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"hint",
                              		lv_hint_6_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleDslGuiModule450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDslGuiModuleAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDslGuiModule"


    // $ANTLR start "entryRuleDslView"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:241:1: entryRuleDslView returns [EObject current=null] : iv_ruleDslView= ruleDslView EOF ;
    public final EObject entryRuleDslView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDslView = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:242:2: (iv_ruleDslView= ruleDslView EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:243:2: iv_ruleDslView= ruleDslView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDslViewRule()); 
            }
            pushFollow(FOLLOW_ruleDslView_in_entryRuleDslView486);
            iv_ruleDslView=ruleDslView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDslView; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDslView496); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDslView"


    // $ANTLR start "ruleDslView"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:250:1: ruleDslView returns [EObject current=null] : ( ( (lv_documentation_0_0= RULE_STRING ) )? otherlv_1= 'View' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) ;
    public final EObject ruleDslView() throws RecognitionException {
        EObject current = null;

        Token lv_documentation_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:253:28: ( ( ( (lv_documentation_0_0= RULE_STRING ) )? otherlv_1= 'View' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:254:1: ( ( (lv_documentation_0_0= RULE_STRING ) )? otherlv_1= 'View' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:254:1: ( ( (lv_documentation_0_0= RULE_STRING ) )? otherlv_1= 'View' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:254:2: ( (lv_documentation_0_0= RULE_STRING ) )? otherlv_1= 'View' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' otherlv_4= '}'
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:254:2: ( (lv_documentation_0_0= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:255:1: (lv_documentation_0_0= RULE_STRING )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:255:1: (lv_documentation_0_0= RULE_STRING )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:256:3: lv_documentation_0_0= RULE_STRING
                    {
                    lv_documentation_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDslView538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_documentation_0_0, grammarAccess.getDslViewAccess().getDocumentationSTRINGTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDslViewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"documentation",
                              		lv_documentation_0_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleDslView556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDslViewAccess().getViewKeyword_1());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:276:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:277:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:277:1: (lv_name_2_0= RULE_ID )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:278:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDslView573); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDslViewAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDslViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleDslView590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDslViewAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDslView602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDslViewAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDslView"


    // $ANTLR start "entryRuleXExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:310:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:311:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:312:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression638);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression648); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:319:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:322:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:324:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression694);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:340:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:341:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:342:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment728);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment738); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:349:1: ruleXAssignment returns [EObject current=null] : ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:352:28: ( ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:353:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:353:1: ( ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||(LA7_1>=RULE_STRING && LA7_1<=RULE_DECIMAL)||LA7_1==14||LA7_1==17||(LA7_1>=19 && LA7_1<=49)||(LA7_1>=51 && LA7_1<=75)) ) {
                    alt7=2;
                }
                else if ( (LA7_1==16) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_STRING||(LA7_0>=RULE_HEX && LA7_0<=RULE_DECIMAL)||LA7_0==14||LA7_0==28||(LA7_0>=35 && LA7_0<=36)||LA7_0==41||LA7_0==47||LA7_0==49||LA7_0==53||LA7_0==55||(LA7_0>=59 && LA7_0<=61)||LA7_0==64||(LA7_0>=66 && LA7_0<=73)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:353:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:353:2: ( () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:353:3: () ( ( ruleValidID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:353:3: ()
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:354:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:359:2: ( ( ruleValidID ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:360:1: ( ruleValidID )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:360:1: ( ruleValidID )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:361:3: ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXAssignment796);
                    ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment812);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:382:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:383:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:383:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:384:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment832);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:401:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:401:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:402:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment862);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:410:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==19) ) {
                        int LA6_1 = input.LA(2);

                        if ( (synpred1_InternalGuixDsl()) ) {
                            alt6=1;
                        }
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:410:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:410:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:410:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:415:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:415:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:415:7: ()
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:416:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:421:2: ( ( ruleOpMultiAssign ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:422:1: ( ruleOpMultiAssign )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:422:1: ( ruleOpMultiAssign )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:423:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment915);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:436:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:437:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:437:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:438:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment938);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:462:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:463:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:464:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign978);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign989); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:471:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:474:28: (kw= '=' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:476:2: kw= '='
            {
            kw=(Token)match(input,16,FOLLOW_16_in_ruleOpSingleAssign1026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:489:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:490:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:491:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1066);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1077); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:498:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:501:28: (kw= '+=' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:503:2: kw= '+='
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpMultiAssign1114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:516:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:517:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:518:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1153);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1163); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:525:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:528:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:529:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:529:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:530:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1210);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:538:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred2_InternalGuixDsl()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:538:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:538:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:538:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:543:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:543:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:543:7: ()
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:544:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:549:2: ( ( ruleOpOr ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:550:1: ( ruleOpOr )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:550:1: ( ruleOpOr )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:551:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1263);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:564:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:565:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:565:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:566:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1286);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:590:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:591:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:592:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1325);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1336); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:599:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:602:28: (kw= '||' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:604:2: kw= '||'
            {
            kw=(Token)match(input,20,FOLLOW_20_in_ruleOpOr1373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:617:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:618:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:619:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1412);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1422); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:626:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:629:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:630:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:630:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:631:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1469);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:639:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred3_InternalGuixDsl()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:639:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:639:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:639:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:644:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:644:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:644:7: ()
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:645:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:650:2: ( ( ruleOpAnd ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:651:1: ( ruleOpAnd )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:651:1: ( ruleOpAnd )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:652:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1522);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:665:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:666:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:666:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:667:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1545);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:691:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:692:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:693:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1584);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1595); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:700:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:703:28: (kw= '&&' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:705:2: kw= '&&'
            {
            kw=(Token)match(input,21,FOLLOW_21_in_ruleOpAnd1632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:718:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:719:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:720:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1671);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1681); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:727:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:730:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:731:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:731:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:732:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1728);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:740:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred4_InternalGuixDsl()) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==23) ) {
                    int LA10_3 = input.LA(2);

                    if ( (synpred4_InternalGuixDsl()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:740:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:740:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:740:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:745:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:745:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:745:7: ()
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:746:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:751:2: ( ( ruleOpEquality ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:752:1: ( ruleOpEquality )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:752:1: ( ruleOpEquality )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:753:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1781);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:766:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:767:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:767:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:768:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1804);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:792:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:793:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:794:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality1843);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality1854); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:801:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:804:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:805:1: (kw= '==' | kw= '!=' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:805:1: (kw= '==' | kw= '!=' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:806:2: kw= '=='
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleOpEquality1892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:813:2: kw= '!='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpEquality1911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:826:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:827:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:828:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1951);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression1961); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:835:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:838:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:839:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:839:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:840:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2008);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:848:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop12:
            do {
                int alt12=3;
                switch ( input.LA(1) ) {
                case 27:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (synpred6_InternalGuixDsl()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 28:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred6_InternalGuixDsl()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (synpred5_InternalGuixDsl()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (synpred6_InternalGuixDsl()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 26:
                    {
                    int LA12_6 = input.LA(2);

                    if ( (synpred6_InternalGuixDsl()) ) {
                        alt12=2;
                    }


                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:848:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:848:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:848:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:848:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:848:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:850:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:850:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:850:6: ()
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:851:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleXRelationalExpression2044); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:860:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:861:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:861:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:862:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2067);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:879:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:879:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:879:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:879:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:879:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:884:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:884:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:884:7: ()
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:885:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:890:2: ( ( ruleOpCompare ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:891:1: ( ruleOpCompare )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:891:1: ( ruleOpCompare )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:892:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2128);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:905:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:906:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:906:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:907:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2151);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:931:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:932:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:933:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2191);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2202); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:940:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:943:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:944:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:944:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 27:
                {
                alt13=3;
                }
                break;
            case 28:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:945:2: kw= '>='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2240); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:952:2: kw= '<='
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:959:2: kw= '>'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpCompare2278); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:966:2: kw= '<'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpCompare2297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:979:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:980:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:981:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2337);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2347); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:988:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:991:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:992:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:992:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:993:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2394);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1001:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1001:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1001:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1001:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1006:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1006:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1006:7: ()
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1007:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1012:2: ( ( ruleOpOther ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1013:1: ( ruleOpOther )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1013:1: ( ruleOpOther )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1014:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2447);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1027:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1028:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1028:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1029:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2470);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1053:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1054:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1055:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2509);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2520); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1062:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1065:28: ( (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1066:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1066:1: (kw= '->' | kw= '..' | kw= '=>' | (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) ) | (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) ) | kw= '<>' | kw= '?:' | kw= '<=>' )
            int alt17=8;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            case 27:
                {
                alt17=4;
                }
                break;
            case 28:
                {
                alt17=5;
                }
                break;
            case 32:
                {
                alt17=6;
                }
                break;
            case 33:
                {
                alt17=7;
                }
                break;
            case 34:
                {
                alt17=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1067:2: kw= '->'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpOther2558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1074:2: kw= '..'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpOther2577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1081:2: kw= '=>'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpOther2596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getEqualsSignGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1087:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1087:6: (kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1088:2: kw= '>' ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_0()); 
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1093:1: ( ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) ) | kw= '>' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==27) ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1==EOF||(LA15_1>=RULE_STRING && LA15_1<=RULE_DECIMAL)||LA15_1==14||LA15_1==28||(LA15_1>=35 && LA15_1<=36)||LA15_1==41||LA15_1==47||LA15_1==49||LA15_1==53||LA15_1==55||(LA15_1>=59 && LA15_1<=61)||LA15_1==64||(LA15_1>=66 && LA15_1<=73)) ) {
                            alt15=2;
                        }
                        else if ( (LA15_1==27) && (synpred8_InternalGuixDsl())) {
                            alt15=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1093:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1093:2: ( ( ( '>' '>' ) )=> (kw= '>' kw= '>' ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1093:3: ( ( '>' '>' ) )=> (kw= '>' kw= '>' )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1097:5: (kw= '>' kw= '>' )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1098:2: kw= '>' kw= '>'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2647); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2660); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1111:2: kw= '>'
                            {
                            kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2681); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getGreaterThanSignKeyword_3_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1117:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1117:6: (kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1118:2: kw= '<' ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_0()); 
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1123:1: ( ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) ) | kw= '<' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==28) ) {
                        int LA16_1 = input.LA(2);

                        if ( (synpred9_InternalGuixDsl()) ) {
                            alt16=1;
                        }
                        else if ( (true) ) {
                            alt16=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1123:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1123:2: ( ( ( '<' '<' ) )=> (kw= '<' kw= '<' ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1123:3: ( ( '<' '<' ) )=> (kw= '<' kw= '<' )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1127:5: (kw= '<' kw= '<' )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1128:2: kw= '<' kw= '<'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2734); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_0()); 
                                  
                            }
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2747); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_0_0_1()); 
                                  
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1141:2: kw= '<'
                            {
                            kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2768); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1148:2: kw= '<>'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpOther2789); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignGreaterThanSignKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1155:2: kw= '?:'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpOther2808); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getQuestionMarkColonKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1162:2: kw= '<=>'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpOther2827); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getLessThanSignEqualsSignGreaterThanSignKeyword_7()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1175:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1176:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1177:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2867);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2877); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1184:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1187:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1188:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1188:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1189:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2924);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1197:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred10_InternalGuixDsl()) ) {
                        alt18=1;
                    }


                }
                else if ( (LA18_0==36) ) {
                    int LA18_3 = input.LA(2);

                    if ( (synpred10_InternalGuixDsl()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1197:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1197:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1197:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1202:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1202:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1202:7: ()
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1203:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1208:2: ( ( ruleOpAdd ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1209:1: ( ruleOpAdd )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1209:1: ( ruleOpAdd )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1210:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2977);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1223:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1224:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1224:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1225:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3000);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1249:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1250:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1251:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3039);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3050); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1258:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1261:28: ( (kw= '+' | kw= '-' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1262:1: (kw= '+' | kw= '-' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1262:1: (kw= '+' | kw= '-' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1263:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpAdd3088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1270:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpAdd3107); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1283:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1284:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1285:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3147);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3157); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1292:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1295:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1296:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1296:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1297:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3204);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1305:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA20_2 = input.LA(2);

                    if ( (synpred11_InternalGuixDsl()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA20_3 = input.LA(2);

                    if ( (synpred11_InternalGuixDsl()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA20_4 = input.LA(2);

                    if ( (synpred11_InternalGuixDsl()) ) {
                        alt20=1;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA20_5 = input.LA(2);

                    if ( (synpred11_InternalGuixDsl()) ) {
                        alt20=1;
                    }


                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1305:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1305:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1305:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1310:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1310:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1310:7: ()
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1311:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1316:2: ( ( ruleOpMulti ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1317:1: ( ruleOpMulti )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1317:1: ( ruleOpMulti )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1318:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3257);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1331:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1332:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1332:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1333:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3280);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1357:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1358:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1359:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3319);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3330); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1366:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1369:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1370:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1370:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt21=1;
                }
                break;
            case 38:
                {
                alt21=2;
                }
                break;
            case 39:
                {
                alt21=3;
                }
                break;
            case 40:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1371:2: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleOpMulti3368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1378:2: kw= '**'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleOpMulti3387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1385:2: kw= '/'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleOpMulti3406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1392:2: kw= '%'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleOpMulti3425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1405:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1406:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1407:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3465);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3475); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1414:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1417:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1418:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1418:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=35 && LA22_0<=36)||LA22_0==41) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_DECIMAL)||LA22_0==14||LA22_0==28||LA22_0==47||LA22_0==49||LA22_0==53||LA22_0==55||(LA22_0>=59 && LA22_0<=61)||LA22_0==64||(LA22_0>=66 && LA22_0<=73)) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1418:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1418:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1418:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1418:3: ()
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1419:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1424:2: ( ( ruleOpUnary ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1425:1: ( ruleOpUnary )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1425:1: ( ruleOpUnary )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1426:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3533);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1439:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1440:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1440:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1441:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3554);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1459:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3583);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1475:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1476:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1477:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3619);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3630); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1484:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1487:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1488:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1488:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 35:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1489:2: kw= '!'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleOpUnary3668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1496:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleOpUnary3687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1503:2: kw= '+'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1516:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1517:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1518:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3746);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3756); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1525:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1528:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1529:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1529:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1530:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3803);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1538:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==42) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred12_InternalGuixDsl()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1538:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1538:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1538:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1540:5: ( () otherlv_2= 'as' )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1540:6: () otherlv_2= 'as'
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1540:6: ()
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1541:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleXCastedExpression3838); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1550:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1551:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1551:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1552:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3861);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1576:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1577:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1578:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3899);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3909); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1585:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;

        EObject lv_memberCallArguments_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1588:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1589:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1589:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )* )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1590:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3956);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1598:1: ( ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? ) )*
            loop32:
            do {
                int alt32=3;
                switch ( input.LA(1) ) {
                case 43:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (synpred13_InternalGuixDsl()) ) {
                        alt32=1;
                    }
                    else if ( (synpred14_InternalGuixDsl()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (synpred14_InternalGuixDsl()) ) {
                        alt32=2;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (synpred14_InternalGuixDsl()) ) {
                        alt32=2;
                    }


                    }
                    break;

                }

                switch (alt32) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1598:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1598:2: ( ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1598:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1598:3: ( ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1598:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1604:25: ( () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1604:26: () otherlv_2= '.' ( ( ruleValidID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1604:26: ()
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1605:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4005); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1614:1: ( ( ruleValidID ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1615:1: ( ruleValidID )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1615:1: ( ruleValidID )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1616:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4028);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4044);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1637:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1638:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1638:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1639:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4066);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1656:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1656:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )? )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1656:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( ( ruleValidID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1656:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1656:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1672:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1672:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1672:8: ()
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1673:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1678:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt25=3;
            	    switch ( input.LA(1) ) {
            	    case 43:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1678:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleXMemberFeatureCall4152); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1683:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1683:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1684:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1684:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1685:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,44,FOLLOW_44_in_ruleXMemberFeatureCall4176); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1699:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1699:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1700:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1700:1: (lv_spreading_9_0= '*.' )
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1701:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,45,FOLLOW_45_in_ruleXMemberFeatureCall4213); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1714:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==28) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1714:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleXMemberFeatureCall4242); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1718:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1719:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1719:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1720:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4263);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1736:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==46) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1736:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4276); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1740:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1741:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1741:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1742:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4297);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop26;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleXMemberFeatureCall4311); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1762:3: ( ( ruleValidID ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1763:1: ( ruleValidID )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1763:1: ( ruleValidID )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1764:3: ruleValidID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4336);
            	    ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1777:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt30=2;
            	    alt30 = dfa30.predict(input);
            	    switch (alt30) {
            	        case 1 :
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1777:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1777:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1777:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1784:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1785:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,47,FOLLOW_47_in_ruleXMemberFeatureCall4370); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1798:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt29=3;
            	            alt29 = dfa29.predict(input);
            	            switch (alt29) {
            	                case 1 :
            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1798:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1798:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1798:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1815:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1816:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4455);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1833:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1833:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1833:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1833:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1834:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1834:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1835:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4483);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1851:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop28:
            	                    do {
            	                        int alt28=2;
            	                        int LA28_0 = input.LA(1);

            	                        if ( (LA28_0==46) ) {
            	                            alt28=1;
            	                        }


            	                        switch (alt28) {
            	                    	case 1 :
            	                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1851:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,46,FOLLOW_46_in_ruleXMemberFeatureCall4496); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1855:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1856:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1856:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1857:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4517);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop28;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,48,FOLLOW_48_in_ruleXMemberFeatureCall4534); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1877:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?
            	    int alt31=2;
            	    alt31 = dfa31.predict(input);
            	    switch (alt31) {
            	        case 1 :
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1877:4: ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure )
            	            {
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1880:1: (lv_memberCallArguments_22_0= ruleXClosure )
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1881:3: lv_memberCallArguments_22_0= ruleXClosure
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXClosureParserRuleCall_1_1_4_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4569);
            	            lv_memberCallArguments_22_0=ruleXClosure();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"memberCallArguments",
            	                      		lv_memberCallArguments_22_0, 
            	                      		"XClosure");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1905:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1906:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1907:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4609);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4619); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1914:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1917:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1918:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1918:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt33=13;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1919:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4666);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1929:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4693);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1939:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4720);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1949:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4747);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1959:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4774);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1969:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4801);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1979:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4828);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1989:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4855);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1999:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4882);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2009:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4909);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2019:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4936);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2029:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4963);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2039:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4990);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2055:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2056:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2057:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5025);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5035); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2064:1: ruleXLiteral returns [EObject current=null] : ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XNumberLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2067:28: ( ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2068:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2068:1: ( ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure ) | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XNumberLiteral_2= ruleXNumberLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt34=6;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) && (synpred18_InternalGuixDsl())) {
                alt34=1;
            }
            else if ( ((LA34_0>=67 && LA34_0<=68)) ) {
                alt34=2;
            }
            else if ( ((LA34_0>=RULE_HEX && LA34_0<=RULE_DECIMAL)) ) {
                alt34=3;
            }
            else if ( (LA34_0==69) ) {
                alt34=4;
            }
            else if ( (LA34_0==RULE_STRING) ) {
                alt34=5;
            }
            else if ( (LA34_0==70) ) {
                alt34=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2068:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2068:2: ( ( ( () '[' ) )=>this_XClosure_0= ruleXClosure )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2068:3: ( ( () '[' ) )=>this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5095);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2081:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5123);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2091:5: this_XNumberLiteral_2= ruleXNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNumberLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5150);
                    this_XNumberLiteral_2=ruleXNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNumberLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2101:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5177);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2111:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5204);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2121:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5231);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2137:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2138:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2139:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5266);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5276); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2146:1: ruleXClosure returns [EObject current=null] : ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_explicitSyntax_5_0=null;
        Token otherlv_7=null;
        EObject lv_declaredFormalParameters_2_0 = null;

        EObject lv_declaredFormalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2149:28: ( ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2150:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2150:1: ( ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2150:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) ) ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )? ( (lv_expression_6_0= ruleXExpressionInClosure ) ) otherlv_7= ']'
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2150:2: ( ( ( () '[' ) )=> ( () otherlv_1= '[' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2150:3: ( ( () '[' ) )=> ( () otherlv_1= '[' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2152:5: ( () otherlv_1= '[' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2152:6: () otherlv_1= '['
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2152:6: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2153:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXClosure5336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_0_0_1());
                  
            }

            }


            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2162:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2162:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2177:6: ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2177:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2177:7: ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_ID||LA36_0==31||LA36_0==47) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2177:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2177:8: ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2178:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2178:1: (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2179:3: lv_declaredFormalParameters_2_0= ruleJvmFormalParameter
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5409);
                            lv_declaredFormalParameters_2_0=ruleJvmFormalParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"declaredFormalParameters",
                                      		lv_declaredFormalParameters_2_0, 
                                      		"JvmFormalParameter");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2195:2: (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==46) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2195:4: otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleXClosure5422); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_1_0_0_1_0());
                            	          
                            	    }
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2199:1: ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) )
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2200:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    {
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2200:1: (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter )
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2201:3: lv_declaredFormalParameters_4_0= ruleJvmFormalParameter
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_1_0_0_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5443);
                            	    lv_declaredFormalParameters_4_0=ruleJvmFormalParameter();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"declaredFormalParameters",
                            	              		lv_declaredFormalParameters_4_0, 
                            	              		"JvmFormalParameter");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop35;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2217:6: ( (lv_explicitSyntax_5_0= '|' ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2218:1: (lv_explicitSyntax_5_0= '|' )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2218:1: (lv_explicitSyntax_5_0= '|' )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2219:3: lv_explicitSyntax_5_0= '|'
                    {
                    lv_explicitSyntax_5_0=(Token)match(input,50,FOLLOW_50_in_ruleXClosure5465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitSyntax_5_0, grammarAccess.getXClosureAccess().getExplicitSyntaxVerticalLineKeyword_1_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXClosureRule());
                      	        }
                             		setWithLastConsumed(current, "explicitSyntax", true, "|");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2232:5: ( (lv_expression_6_0= ruleXExpressionInClosure ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2233:1: (lv_expression_6_0= ruleXExpressionInClosure )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2233:1: (lv_expression_6_0= ruleXExpressionInClosure )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2234:3: lv_expression_6_0= ruleXExpressionInClosure
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionInClosureParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5502);
            lv_expression_6_0=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpressionInClosure");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleXClosure5514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXExpressionInClosure"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2262:1: entryRuleXExpressionInClosure returns [EObject current=null] : iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF ;
    public final EObject entryRuleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInClosure = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2263:2: (iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2264:2: iv_ruleXExpressionInClosure= ruleXExpressionInClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5550);
            iv_ruleXExpressionInClosure=ruleXExpressionInClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInClosure5560); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInClosure"


    // $ANTLR start "ruleXExpressionInClosure"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2271:1: ruleXExpressionInClosure returns [EObject current=null] : ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) ;
    public final EObject ruleXExpressionInClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2274:28: ( ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2275:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2275:1: ( () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )* )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2275:2: () ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2275:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2276:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXExpressionInClosureAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2281:2: ( ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )? )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_DECIMAL)||LA39_0==14||LA39_0==28||(LA39_0>=35 && LA39_0<=36)||LA39_0==41||LA39_0==47||LA39_0==49||LA39_0==53||LA39_0==55||(LA39_0>=59 && LA39_0<=64)||(LA39_0>=66 && LA39_0<=73)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2281:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) ) (otherlv_2= ';' )?
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2281:3: ( (lv_expressions_1_0= ruleXExpressionInsideBlock ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2282:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2282:1: (lv_expressions_1_0= ruleXExpressionInsideBlock )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2283:3: lv_expressions_1_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXExpressionInClosureAccess().getExpressionsXExpressionInsideBlockParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5616);
            	    lv_expressions_1_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXExpressionInClosureRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_1_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2299:2: (otherlv_2= ';' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==52) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2299:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleXExpressionInClosure5629); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2311:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2312:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2313:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5669);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5679); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2320:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_explicitSyntax_4_0=null;
        EObject lv_declaredFormalParameters_1_0 = null;

        EObject lv_declaredFormalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2323:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2324:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2324:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2324:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2324:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2324:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2340:6: ( () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2340:7: () ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_4_0= '|' ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2340:7: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2341:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2346:2: ( ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID||LA41_0==31||LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2346:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2346:3: ( (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2347:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2347:1: (lv_declaredFormalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2348:3: lv_declaredFormalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5787);
                    lv_declaredFormalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"declaredFormalParameters",
                              		lv_declaredFormalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2364:2: (otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==46) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2364:4: otherlv_2= ',' ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXShortClosure5800); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2368:1: ( (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2369:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2369:1: (lv_declaredFormalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2370:3: lv_declaredFormalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getDeclaredFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5821);
                    	    lv_declaredFormalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"declaredFormalParameters",
                    	              		lv_declaredFormalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2386:6: ( (lv_explicitSyntax_4_0= '|' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2387:1: (lv_explicitSyntax_4_0= '|' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2387:1: (lv_explicitSyntax_4_0= '|' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2388:3: lv_explicitSyntax_4_0= '|'
            {
            lv_explicitSyntax_4_0=(Token)match(input,50,FOLLOW_50_in_ruleXShortClosure5843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_explicitSyntax_4_0, grammarAccess.getXShortClosureAccess().getExplicitSyntaxVerticalLineKeyword_0_0_2_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXShortClosureRule());
              	        }
                     		setWithLastConsumed(current, "explicitSyntax", true, "|");
              	    
            }

            }


            }


            }


            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2401:4: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2402:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2402:1: (lv_expression_5_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2403:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5879);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2427:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2428:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2429:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5915);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5925); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2436:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2439:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2440:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2440:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2440:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleXParenthesizedExpression5962); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5984);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleXParenthesizedExpression5995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2465:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2466:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2467:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6031);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression6041); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2474:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2477:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2478:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2478:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2478:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2478:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2479:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXIfExpression6087); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXIfExpression6099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2492:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2493:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2493:1: (lv_if_3_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2494:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6120);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXIfExpression6132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2514:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2515:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2515:1: (lv_then_5_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2516:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6153);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2532:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                int LA42_1 = input.LA(2);

                if ( (synpred22_InternalGuixDsl()) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2532:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2532:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2532:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleXIfExpression6174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2537:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2538:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2538:1: (lv_else_7_0= ruleXExpression )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2539:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression6196);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2563:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2564:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2565:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6234);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression6244); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2572:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_localVarName_2_0 = null;

        EObject lv_switch_4_0 = null;

        AntlrDatatypeRuleToken lv_localVarName_6_0 = null;

        EObject lv_switch_8_0 = null;

        EObject lv_cases_11_0 = null;

        EObject lv_default_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2575:28: ( ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2576:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2576:1: ( () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2576:2: () otherlv_1= 'switch' ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) ) otherlv_10= '{' ( (lv_cases_11_0= ruleXCasePart ) )+ (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )? otherlv_15= '}'
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2576:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2577:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleXSwitchExpression6290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2586:1: ( ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) ) | ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_DECIMAL)||LA44_0==14||LA44_0==28||(LA44_0>=35 && LA44_0<=36)||LA44_0==41||LA44_0==49||LA44_0==53||LA44_0==55||(LA44_0>=59 && LA44_0<=61)||LA44_0==64||(LA44_0>=66 && LA44_0<=73)) ) {
                alt44=1;
            }
            else if ( (LA44_0==47) ) {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==RULE_ID) ) {
                    int LA44_3 = input.LA(3);

                    if ( (LA44_3==16||(LA44_3>=19 && LA44_3<=40)||(LA44_3>=42 && LA44_3<=45)||(LA44_3>=47 && LA44_3<=49)||LA44_3==65) ) {
                        alt44=1;
                    }
                    else if ( (LA44_3==56) && (synpred24_InternalGuixDsl())) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA44_2==RULE_STRING||(LA44_2>=RULE_HEX && LA44_2<=RULE_DECIMAL)||LA44_2==14||LA44_2==28||(LA44_2>=35 && LA44_2<=36)||LA44_2==41||LA44_2==47||LA44_2==49||LA44_2==53||LA44_2==55||(LA44_2>=59 && LA44_2<=61)||LA44_2==64||(LA44_2>=66 && LA44_2<=73)) ) {
                    alt44=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2586:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2586:2: ( ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2586:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )? ( (lv_switch_4_0= ruleXExpression ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2586:3: ( ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID) ) {
                        int LA43_1 = input.LA(2);

                        if ( (LA43_1==56) && (synpred23_InternalGuixDsl())) {
                            alt43=1;
                        }
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2586:4: ( ( ( ( ruleValidID ) ) ':' ) )=> ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2591:5: ( ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':' )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2591:6: ( (lv_localVarName_2_0= ruleValidID ) ) otherlv_3= ':'
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2591:6: ( (lv_localVarName_2_0= ruleValidID ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2592:1: (lv_localVarName_2_0= ruleValidID )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2592:1: (lv_localVarName_2_0= ruleValidID )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2593:3: lv_localVarName_2_0= ruleValidID
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_0_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6333);
                            lv_localVarName_2_0=ruleValidID();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"localVarName",
                                      		lv_localVarName_2_0, 
                                      		"ValidID");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6345); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_0_0_0_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2613:4: ( (lv_switch_4_0= ruleXExpression ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2614:1: (lv_switch_4_0= ruleXExpression )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2614:1: (lv_switch_4_0= ruleXExpression )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2615:3: lv_switch_4_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6369);
                    lv_switch_4_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_4_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2632:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2632:6: ( ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')' )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2632:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) ) ( (lv_switch_8_0= ruleXExpression ) ) otherlv_9= ')'
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2632:7: ( ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2632:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )=> (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2638:5: (otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':' )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2638:7: otherlv_5= '(' ( (lv_localVarName_6_0= ruleValidID ) ) otherlv_7= ':'
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression6413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftParenthesisKeyword_2_1_0_0_0());
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2642:1: ( (lv_localVarName_6_0= ruleValidID ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2643:1: (lv_localVarName_6_0= ruleValidID )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2643:1: (lv_localVarName_6_0= ruleValidID )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2644:3: lv_localVarName_6_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getLocalVarNameValidIDParserRuleCall_2_1_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXSwitchExpression6434);
                    lv_localVarName_6_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_6_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1_0_0_2());
                          
                    }

                    }


                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2664:3: ( (lv_switch_8_0= ruleXExpression ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2665:1: (lv_switch_8_0= ruleXExpression )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2665:1: (lv_switch_8_0= ruleXExpression )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2666:3: lv_switch_8_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6469);
                    lv_switch_8_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_8_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6481); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getXSwitchExpressionAccess().getRightParenthesisKeyword_2_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleXSwitchExpression6495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2690:1: ( (lv_cases_11_0= ruleXCasePart ) )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID||LA45_0==31||LA45_0==47||LA45_0==56||LA45_0==58) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2691:1: (lv_cases_11_0= ruleXCasePart )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2691:1: (lv_cases_11_0= ruleXCasePart )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2692:3: lv_cases_11_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6516);
            	    lv_cases_11_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_11_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2708:3: (otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==57) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2708:5: otherlv_12= 'default' otherlv_13= ':' ( (lv_default_14_0= ruleXExpression ) )
                    {
                    otherlv_12=(Token)match(input,57,FOLLOW_57_in_ruleXSwitchExpression6530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,56,FOLLOW_56_in_ruleXSwitchExpression6542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_5_1());
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2716:1: ( (lv_default_14_0= ruleXExpression ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2717:1: (lv_default_14_0= ruleXExpression )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2717:1: (lv_default_14_0= ruleXExpression )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2718:3: lv_default_14_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6563);
                    lv_default_14_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_14_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleXSwitchExpression6577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2746:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2747:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2748:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6613);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6623); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2755:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2758:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2759:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2759:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2759:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2759:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==31||LA47_0==47) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2760:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2760:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2761:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6669);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2777:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2777:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleXCasePart6683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2781:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2782:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2782:1: (lv_case_2_0= ruleXExpression )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2783:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6704);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,56,FOLLOW_56_in_ruleXCasePart6718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2803:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2804:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2804:1: (lv_then_4_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2805:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6739);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2829:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2830:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2831:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6775);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6785); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2838:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2841:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2842:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2842:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2842:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2842:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2843:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXForLoopExpression6831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXForLoopExpression6843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2856:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2857:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2857:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2858:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6864);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleXForLoopExpression6876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2878:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2879:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2879:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2880:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6897);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleXForLoopExpression6909); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2900:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2901:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2901:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2902:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6930);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2926:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2927:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2928:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6966);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6976); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2935:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2938:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2939:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2939:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2939:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2939:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2940:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXWhileExpression7022); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXWhileExpression7034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2953:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2954:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2954:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2955:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7055);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXWhileExpression7067); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2975:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2976:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2976:1: (lv_body_5_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2977:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression7088);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3001:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3002:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3003:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7124);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression7134); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3010:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3013:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3014:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3014:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3014:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3014:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3015:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXDoWhileExpression7180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3024:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3025:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3025:1: (lv_body_2_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3026:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7201);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,60,FOLLOW_60_in_ruleXDoWhileExpression7213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleXDoWhileExpression7225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3050:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3051:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3051:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3052:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7246);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,48,FOLLOW_48_in_ruleXDoWhileExpression7258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3080:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3081:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3082:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7294);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression7304); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3089:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3092:28: ( ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3093:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3093:1: ( () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3093:2: () otherlv_1= '{' ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )* otherlv_4= '}'
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3093:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3094:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getXBlockExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleXBlockExpression7350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3103:1: ( ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )? )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_DECIMAL)||LA50_0==14||LA50_0==28||(LA50_0>=35 && LA50_0<=36)||LA50_0==41||LA50_0==47||LA50_0==49||LA50_0==53||LA50_0==55||(LA50_0>=59 && LA50_0<=64)||(LA50_0>=66 && LA50_0<=73)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3103:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) ) (otherlv_3= ';' )?
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3103:2: ( (lv_expressions_2_0= ruleXExpressionInsideBlock ) )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3104:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3104:1: (lv_expressions_2_0= ruleXExpressionInsideBlock )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3105:3: lv_expressions_2_0= ruleXExpressionInsideBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionInsideBlockParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7372);
            	    lv_expressions_2_0=ruleXExpressionInsideBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpressionInsideBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3121:2: (otherlv_3= ';' )?
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==52) ) {
            	        alt49=1;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3121:4: otherlv_3= ';'
            	            {
            	            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXBlockExpression7385); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleXBlockExpression7401); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpressionInsideBlock"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3137:1: entryRuleXExpressionInsideBlock returns [EObject current=null] : iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF ;
    public final EObject entryRuleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpressionInsideBlock = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3138:2: (iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3139:2: iv_ruleXExpressionInsideBlock= ruleXExpressionInsideBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionInsideBlockRule()); 
            }
            pushFollow(FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7437);
            iv_ruleXExpressionInsideBlock=ruleXExpressionInsideBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpressionInsideBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7447); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXExpressionInsideBlock"


    // $ANTLR start "ruleXExpressionInsideBlock"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3146:1: ruleXExpressionInsideBlock returns [EObject current=null] : (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) ;
    public final EObject ruleXExpressionInsideBlock() throws RecognitionException {
        EObject current = null;

        EObject this_XVariableDeclaration_0 = null;

        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3149:28: ( (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3150:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3150:1: (this_XVariableDeclaration_0= ruleXVariableDeclaration | this_XExpression_1= ruleXExpression )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=62 && LA51_0<=63)) ) {
                alt51=1;
            }
            else if ( ((LA51_0>=RULE_STRING && LA51_0<=RULE_DECIMAL)||LA51_0==14||LA51_0==28||(LA51_0>=35 && LA51_0<=36)||LA51_0==41||LA51_0==47||LA51_0==49||LA51_0==53||LA51_0==55||(LA51_0>=59 && LA51_0<=61)||LA51_0==64||(LA51_0>=66 && LA51_0<=73)) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3151:5: this_XVariableDeclaration_0= ruleXVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7494);
                    this_XVariableDeclaration_0=ruleXVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3161:5: this_XExpression_1= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXExpressionInsideBlockAccess().getXExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7521);
                    this_XExpression_1=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXExpressionInsideBlock"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3177:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3178:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3179:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7556);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration7566); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3186:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_writeable_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3189:28: ( ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3190:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3190:1: ( () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )? )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3190:2: () ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' ) ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) ) (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3190:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3191:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3196:2: ( ( (lv_writeable_1_0= 'var' ) ) | otherlv_2= 'val' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==62) ) {
                alt52=1;
            }
            else if ( (LA52_0==63) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3196:3: ( (lv_writeable_1_0= 'var' ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3196:3: ( (lv_writeable_1_0= 'var' ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3197:1: (lv_writeable_1_0= 'var' )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3197:1: (lv_writeable_1_0= 'var' )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3198:3: lv_writeable_1_0= 'var'
                    {
                    lv_writeable_1_0=(Token)match(input,62,FOLLOW_62_in_ruleXVariableDeclaration7619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_writeable_1_0, grammarAccess.getXVariableDeclarationAccess().getWriteableVarKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "writeable", true, "var");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3212:7: otherlv_2= 'val'
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleXVariableDeclaration7650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXVariableDeclarationAccess().getValKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3216:2: ( ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) ) | ( (lv_name_5_0= ruleValidID ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (synpred25_InternalGuixDsl()) ) {
                    alt53=1;
                }
                else if ( (true) ) {
                    alt53=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA53_0==47) && (synpred25_InternalGuixDsl())) {
                alt53=1;
            }
            else if ( (LA53_0==31) && (synpred25_InternalGuixDsl())) {
                alt53=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3216:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3216:3: ( ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3216:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )=> ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3224:6: ( ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3224:7: ( (lv_type_3_0= ruleJvmTypeReference ) ) ( (lv_name_4_0= ruleValidID ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3224:7: ( (lv_type_3_0= ruleJvmTypeReference ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3225:1: (lv_type_3_0= ruleJvmTypeReference )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3225:1: (lv_type_3_0= ruleJvmTypeReference )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3226:3: lv_type_3_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_2_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7698);
                    lv_type_3_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3242:2: ( (lv_name_4_0= ruleValidID ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3243:1: (lv_name_4_0= ruleValidID )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3243:1: (lv_name_4_0= ruleValidID )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3244:3: lv_name_4_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_0_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7719);
                    lv_name_4_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_4_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3261:6: ( (lv_name_5_0= ruleValidID ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3261:6: ( (lv_name_5_0= ruleValidID ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3262:1: (lv_name_5_0= ruleValidID )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3262:1: (lv_name_5_0= ruleValidID )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3263:3: lv_name_5_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getNameValidIDParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleXVariableDeclaration7748);
                    lv_name_5_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_5_0, 
                              		"ValidID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3279:3: (otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==16) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3279:5: otherlv_6= '=' ( (lv_right_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleXVariableDeclaration7762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3283:1: ( (lv_right_7_0= ruleXExpression ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3284:1: (lv_right_7_0= ruleXExpression )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3284:1: (lv_right_7_0= ruleXExpression )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3285:3: lv_right_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7783);
                    lv_right_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3309:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3310:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3311:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7821);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter7831); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3318:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3321:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3322:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3322:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3322:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3322:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==RULE_ID||LA55_1==28||LA55_1==43||LA55_1==49) ) {
                    alt55=1;
                }
            }
            else if ( (LA55_0==31||LA55_0==47) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3323:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3323:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3324:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7877);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3340:3: ( (lv_name_1_0= ruleValidID ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3341:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3341:1: (lv_name_1_0= ruleValidID )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3342:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleJvmFormalParameter7899);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleFullJvmFormalParameter"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3366:1: entryRuleFullJvmFormalParameter returns [EObject current=null] : iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF ;
    public final EObject entryRuleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullJvmFormalParameter = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3367:2: (iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3368:2: iv_ruleFullJvmFormalParameter= ruleFullJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFullJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7935);
            iv_ruleFullJvmFormalParameter=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFullJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7945); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullJvmFormalParameter"


    // $ANTLR start "ruleFullJvmFormalParameter"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3375:1: ruleFullJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) ;
    public final EObject ruleFullJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_parameterType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3378:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3379:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3379:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3379:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) ) ( (lv_name_1_0= ruleValidID ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3379:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3380:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3380:1: (lv_parameterType_0_0= ruleJvmTypeReference )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3381:3: lv_parameterType_0_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7991);
            lv_parameterType_0_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"parameterType",
                      		lv_parameterType_0_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3397:2: ( (lv_name_1_0= ruleValidID ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3398:1: (lv_name_1_0= ruleValidID )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3398:1: (lv_name_1_0= ruleValidID )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3399:3: lv_name_1_0= ruleValidID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFullJvmFormalParameterAccess().getNameValidIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8012);
            lv_name_1_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFullJvmFormalParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ValidID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3423:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3424:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3425:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8048);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall8058); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3432:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;

        EObject lv_featureCallArguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3435:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3436:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3436:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )? )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3436:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3436:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3437:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3442:2: ( ( ruleStaticQualifier ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==65) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3443:1: ( ruleStaticQualifier )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3443:1: ( ruleStaticQualifier )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3444:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8115);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3457:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==28) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3457:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleXFeatureCall8129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3461:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3462:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3462:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3463:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8150);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3479:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==46) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3479:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleXFeatureCall8163); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3483:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3484:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3484:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3485:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8184);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleXFeatureCall8198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3505:3: ( ( ruleIdOrSuper ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3506:1: ( ruleIdOrSuper )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3506:1: ( ruleIdOrSuper )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3507:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8223);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3520:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt61=2;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3520:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3520:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3520:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3527:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3528:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,47,FOLLOW_47_in_ruleXFeatureCall8257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3541:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt60=3;
                    alt60 = dfa60.predict(input);
                    switch (alt60) {
                        case 1 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3541:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3541:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3541:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3558:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3559:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8342);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3576:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3576:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3576:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3576:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3577:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3577:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3578:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8370);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3594:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop59:
                            do {
                                int alt59=2;
                                int LA59_0 = input.LA(1);

                                if ( (LA59_0==46) ) {
                                    alt59=1;
                                }


                                switch (alt59) {
                            	case 1 :
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3594:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,46,FOLLOW_46_in_ruleXFeatureCall8383); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3598:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3599:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3599:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3600:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall8404);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop59;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,48,FOLLOW_48_in_ruleXFeatureCall8421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3620:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?
            int alt62=2;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3620:4: ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3623:1: (lv_featureCallArguments_14_0= ruleXClosure )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3624:3: lv_featureCallArguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXFeatureCall8456);
                    lv_featureCallArguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"featureCallArguments",
                              		lv_featureCallArguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3648:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3649:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3650:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8494);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper8505); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3657:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3660:28: ( (this_ValidID_0= ruleValidID | kw= 'super' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3661:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3661:1: (this_ValidID_0= ruleValidID | kw= 'super' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) ) {
                alt63=1;
            }
            else if ( (LA63_0==64) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3662:5: this_ValidID_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIdOrSuperAccess().getValidIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValidID_in_ruleIdOrSuper8552);
                    this_ValidID_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ValidID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3674:2: kw= 'super'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleIdOrSuper8576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3687:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3688:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3689:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8617);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier8628); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3696:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3699:28: ( (this_ValidID_0= ruleValidID kw= '::' )+ )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3700:1: (this_ValidID_0= ruleValidID kw= '::' )+
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3700:1: (this_ValidID_0= ruleValidID kw= '::' )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    int LA64_2 = input.LA(2);

                    if ( (LA64_2==65) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3701:5: this_ValidID_0= ruleValidID kw= '::'
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStaticQualifierAccess().getValidIDParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleStaticQualifier8675);
            	    this_ValidID_0=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    kw=(Token)match(input,65,FOLLOW_65_in_ruleStaticQualifier8693); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3725:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3726:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3727:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8734);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall8744); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3734:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;

        EObject lv_arguments_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3737:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3738:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3738:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )? )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3738:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3738:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3739:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleXConstructorCall8790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3748:1: ( ( ruleQualifiedName ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3749:1: ( ruleQualifiedName )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3749:1: ( ruleQualifiedName )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3750:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8813);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3763:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt66=2;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3763:3: ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3763:3: ( ( '<' )=>otherlv_3= '<' )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3763:4: ( '<' )=>otherlv_3= '<'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleXConstructorCall8834); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }

                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3768:2: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3769:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3769:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3770:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8856);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3786:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==46) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3786:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,46,FOLLOW_46_in_ruleXConstructorCall8869); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3790:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3791:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3791:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3792:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8890);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleXConstructorCall8904); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3812:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3812:4: ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3812:4: ( ( '(' )=>otherlv_8= '(' )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3812:5: ( '(' )=>otherlv_8= '('
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_47_in_ruleXConstructorCall8927); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0());
                          
                    }

                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3817:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt68=3;
                    alt68 = dfa68.predict(input);
                    switch (alt68) {
                        case 1 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3817:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3817:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3817:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3834:1: (lv_arguments_9_0= ruleXShortClosure )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3835:3: lv_arguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9000);
                            lv_arguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3852:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3852:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3852:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3852:7: ( (lv_arguments_10_0= ruleXExpression ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3853:1: (lv_arguments_10_0= ruleXExpression )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3853:1: (lv_arguments_10_0= ruleXExpression )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3854:3: lv_arguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9028);
                            lv_arguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3870:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==46) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3870:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,46,FOLLOW_46_in_ruleXConstructorCall9041); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3874:1: ( (lv_arguments_12_0= ruleXExpression ) )
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3875:1: (lv_arguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3875:1: (lv_arguments_12_0= ruleXExpression )
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3876:3: lv_arguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall9062);
                            	    lv_arguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop67;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,48,FOLLOW_48_in_ruleXConstructorCall9079); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3896:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?
            int alt70=2;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3896:4: ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3899:1: (lv_arguments_14_0= ruleXClosure )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3900:3: lv_arguments_14_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXClosureParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXConstructorCall9114);
                    lv_arguments_14_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_14_0, 
                              		"XClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3924:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3925:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3926:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9151);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral9161); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3933:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3936:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3937:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3937:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3937:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3937:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3938:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3943:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==67) ) {
                alt71=1;
            }
            else if ( (LA71_0==68) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3943:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleXBooleanLiteral9208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3948:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3948:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3949:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3949:1: (lv_isTrue_2_0= 'true' )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3950:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,68,FOLLOW_68_in_ruleXBooleanLiteral9232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3971:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3972:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3973:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9282);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral9292); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3980:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3983:28: ( ( () otherlv_1= 'null' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3984:1: ( () otherlv_1= 'null' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3984:1: ( () otherlv_1= 'null' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3984:2: () otherlv_1= 'null'
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3984:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3985:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleXNullLiteral9338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXNumberLiteral"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4002:1: entryRuleXNumberLiteral returns [EObject current=null] : iv_ruleXNumberLiteral= ruleXNumberLiteral EOF ;
    public final EObject entryRuleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNumberLiteral = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4003:2: (iv_ruleXNumberLiteral= ruleXNumberLiteral EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4004:2: iv_ruleXNumberLiteral= ruleXNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9374);
            iv_ruleXNumberLiteral=ruleXNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNumberLiteral9384); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXNumberLiteral"


    // $ANTLR start "ruleXNumberLiteral"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4011:1: ruleXNumberLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleNumber ) ) ) ;
    public final EObject ruleXNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4014:28: ( ( () ( (lv_value_1_0= ruleNumber ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4015:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4015:1: ( () ( (lv_value_1_0= ruleNumber ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4015:2: () ( (lv_value_1_0= ruleNumber ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4015:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4016:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNumberLiteralAccess().getXNumberLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4021:2: ( (lv_value_1_0= ruleNumber ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4022:1: (lv_value_1_0= ruleNumber )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4022:1: (lv_value_1_0= ruleNumber )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4023:3: lv_value_1_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXNumberLiteralAccess().getValueNumberParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleXNumberLiteral9439);
            lv_value_1_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXNumberLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4047:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4048:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4049:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9475);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral9485); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4056:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4059:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4060:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4060:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4060:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4060:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4061:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4066:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4067:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4067:1: (lv_value_1_0= RULE_STRING )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4068:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral9536); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4092:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4093:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4094:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9577);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral9587); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4101:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4104:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4105:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4105:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4105:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4105:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4106:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleXTypeLiteral9633); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,47,FOLLOW_47_in_ruleXTypeLiteral9645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4119:1: ( ( ruleQualifiedName ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4120:1: ( ruleQualifiedName )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4120:1: ( ruleQualifiedName )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4121:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9668);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXTypeLiteral9680); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4146:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4147:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4148:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9716);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression9726); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4155:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4158:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4159:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4159:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4159:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4159:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4160:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleXThrowExpression9772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4169:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4170:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4170:1: (lv_expression_2_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4171:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression9793);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4195:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4196:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4197:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9829);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression9839); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4204:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4207:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4208:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4208:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4208:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4208:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4209:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleXReturnExpression9885); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4218:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4218:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4223:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4224:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression9916);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4248:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4249:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4250:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9953);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9963); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4257:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4260:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4261:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4261:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4261:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4261:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4262:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleXTryCatchFinallyExpression10009); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4271:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4272:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4272:1: (lv_expression_2_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4273:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10030);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4289:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==75) ) {
                alt75=1;
            }
            else if ( (LA75_0==74) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4289:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4289:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4289:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4289:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt73=0;
                    loop73:
                    do {
                        int alt73=2;
                        int LA73_0 = input.LA(1);

                        if ( (LA73_0==75) ) {
                            int LA73_2 = input.LA(2);

                            if ( (synpred34_InternalGuixDsl()) ) {
                                alt73=1;
                            }


                        }


                        switch (alt73) {
                    	case 1 :
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4289:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4291:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4292:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10060);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt73 >= 1 ) break loop73;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(73, input);
                                throw eee;
                        }
                        cnt73++;
                    } while (true);

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4308:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==74) ) {
                        int LA74_1 = input.LA(2);

                        if ( (synpred35_InternalGuixDsl()) ) {
                            alt74=1;
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4308:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4308:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4308:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression10082); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4313:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4314:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4314:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4315:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10104);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4332:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4332:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4332:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,74,FOLLOW_74_in_ruleXTryCatchFinallyExpression10126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4336:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4337:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4337:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4338:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10147);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4362:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4363:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4364:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10185);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause10195); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4371:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4374:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4375:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4375:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4375:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4375:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4375:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_75_in_ruleXCatchClause10240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXCatchClause10253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4384:1: ( (lv_declaredParam_2_0= ruleFullJvmFormalParameter ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4385:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4385:1: (lv_declaredParam_2_0= ruleFullJvmFormalParameter )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4386:3: lv_declaredParam_2_0= ruleFullJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamFullJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10274);
            lv_declaredParam_2_0=ruleFullJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"FullJvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXCatchClause10286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4406:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4407:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4407:1: (lv_expression_4_0= ruleXExpression )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4408:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause10307);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4432:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4433:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4434:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10344);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName10355); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4441:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4444:28: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4445:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4445:1: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4446:5: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10402);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ValidID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4456:1: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==43) ) {
                    int LA76_2 = input.LA(2);

                    if ( (LA76_2==RULE_ID) ) {
                        int LA76_3 = input.LA(3);

                        if ( (synpred37_InternalGuixDsl()) ) {
                            alt76=1;
                        }


                    }


                }


                switch (alt76) {
            	case 1 :
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4456:2: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4456:2: ( ( '.' )=>kw= '.' )
            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4456:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,43,FOLLOW_43_in_ruleQualifiedName10430); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleValidID_in_ruleQualifiedName10453);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ValidID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleNumber"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4483:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        	
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4487:2: (iv_ruleNumber= ruleNumber EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4488:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber10507);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber10518); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4498:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4502:28: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4503:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4503:1: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_HEX) ) {
                alt80=1;
            }
            else if ( ((LA80_0>=RULE_INT && LA80_0<=RULE_DECIMAL)) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4503:6: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleNumber10562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HEX_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4511:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4511:6: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4511:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4511:7: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==RULE_INT) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==RULE_DECIMAL) ) {
                        alt77=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4511:12: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10590); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_INT_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4519:10: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10616); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_DECIMAL_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4526:2: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==43) ) {
                        int LA79_1 = input.LA(2);

                        if ( ((LA79_1>=RULE_INT && LA79_1<=RULE_DECIMAL)) ) {
                            alt79=1;
                        }
                    }
                    switch (alt79) {
                        case 1 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4527:2: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,43,FOLLOW_43_in_ruleNumber10636); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
                                  
                            }
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4532:1: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==RULE_INT) ) {
                                alt78=1;
                            }
                            else if ( (LA78_0==RULE_DECIMAL) ) {
                                alt78=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 78, 0, input);

                                throw nvae;
                            }
                            switch (alt78) {
                                case 1 :
                                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4532:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber10652); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_INT_4);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                                          
                                    }

                                    }
                                    break;
                                case 2 :
                                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4540:10: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleNumber10678); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      		current.merge(this_DECIMAL_5);
                                          
                                    }
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                                          
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4558:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4559:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4560:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10731);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference10741); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4567:1: ruleJvmTypeReference returns [EObject current=null] : ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_4 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4570:28: ( ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4571:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4571:1: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* ) | this_XFunctionTypeRef_4= ruleXFunctionTypeRef )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_ID) ) {
                alt82=1;
            }
            else if ( (LA82_0==31||LA82_0==47) ) {
                alt82=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4571:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4571:2: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )* )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4572:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10789);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4580:1: ( ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==49) ) {
                            int LA81_2 = input.LA(2);

                            if ( (LA81_2==51) ) {
                                int LA81_3 = input.LA(3);

                                if ( (synpred38_InternalGuixDsl()) ) {
                                    alt81=1;
                                }


                            }


                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4580:2: ( ( () '[' ']' ) )=> ( () otherlv_2= '[' otherlv_3= ']' )
                    	    {
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4583:5: ( () otherlv_2= '[' otherlv_3= ']' )
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4583:6: () otherlv_2= '[' otherlv_3= ']'
                    	    {
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4583:6: ()
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4584:5: 
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	              current = forceCreateModelElementAndSet(
                    	                  grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0(),
                    	                  current);
                    	          
                    	    }

                    	    }

                    	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleJvmTypeReference10827); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getJvmTypeReferenceAccess().getLeftSquareBracketKeyword_0_1_0_1());
                    	          
                    	    }
                    	    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleJvmTypeReference10839); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmTypeReferenceAccess().getRightSquareBracketKeyword_0_1_0_2());
                    	          
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4599:5: this_XFunctionTypeRef_4= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10871);
                    this_XFunctionTypeRef_4=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4615:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4616:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4617:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10906);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef10916); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4624:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4627:28: ( ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4628:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4628:1: ( (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4628:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4628:2: (otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==47) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4628:4: otherlv_0= '(' ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleXFunctionTypeRef10954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4632:1: ( ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==RULE_ID||LA84_0==31||LA84_0==47) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4632:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4632:2: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4633:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            {
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4633:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4634:3: lv_paramTypes_1_0= ruleJvmTypeReference
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10976);
                            lv_paramTypes_1_0=ruleJvmTypeReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"paramTypes",
                                      		lv_paramTypes_1_0, 
                                      		"JvmTypeReference");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4650:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                            loop83:
                            do {
                                int alt83=2;
                                int LA83_0 = input.LA(1);

                                if ( (LA83_0==46) ) {
                                    alt83=1;
                                }


                                switch (alt83) {
                            	case 1 :
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4650:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    {
                            	    otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleXFunctionTypeRef10989); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_1_1_0());
                            	          
                            	    }
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4654:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4655:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    {
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4655:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                            	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4656:3: lv_paramTypes_3_0= ruleJvmTypeReference
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11010);
                            	    lv_paramTypes_3_0=ruleJvmTypeReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"paramTypes",
                            	              		lv_paramTypes_3_0, 
                            	              		"JvmTypeReference");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop83;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXFunctionTypeRef11026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleXFunctionTypeRef11040); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4680:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4681:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4681:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4682:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11061);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4706:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4707:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4708:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11097);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11107); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4715:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4718:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4719:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4719:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4719:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4719:2: ( ( ruleQualifiedName ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4720:1: ( ruleQualifiedName )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4720:1: ( ruleQualifiedName )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4721:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11155);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4734:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt87=2;
            alt87 = dfa87.predict(input);
            switch (alt87) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4734:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4734:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4734:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleJvmParameterizedTypeReference11176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4739:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4740:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4740:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4741:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11198);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4757:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==46) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4757:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,46,FOLLOW_46_in_ruleJvmParameterizedTypeReference11211); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4761:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4762:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4762:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4763:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11232);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleJvmParameterizedTypeReference11246); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4791:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4792:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4793:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11284);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11294); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4800:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4803:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4804:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4804:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_ID||LA88_0==31||LA88_0==47) ) {
                alt88=1;
            }
            else if ( (LA88_0==76) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4805:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11341);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4815:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11368);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4831:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4832:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4833:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11403);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11413); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4840:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4843:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4844:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4844:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4844:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4844:2: ()
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4845:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleJvmWildcardTypeReference11459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4854:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt89=3;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==77) ) {
                alt89=1;
            }
            else if ( (LA89_0==64) ) {
                alt89=2;
            }
            switch (alt89) {
                case 1 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4854:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4854:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4855:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4855:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4856:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11481);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4873:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4873:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4874:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4874:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4875:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11508);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4899:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4900:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4901:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11546);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound11556); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4908:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4911:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4912:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4912:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4912:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleJvmUpperBound11593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4916:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4917:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4917:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4918:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11614);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4942:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4943:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4944:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11650);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11660); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4951:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4954:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4955:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4955:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4955:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleJvmUpperBoundAnded11697); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4959:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4960:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4960:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4961:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11718);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4985:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4986:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4987:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11754);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound11764); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4994:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4997:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4998:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4998:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4998:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleJvmLowerBound11801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:5002:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:5003:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:5003:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:5004:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11822);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJvmLowerBound"


    // $ANTLR start "entryRuleValidID"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:5030:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:5031:2: (iv_ruleValidID= ruleValidID EOF )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:5032:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_ruleValidID_in_entryRuleValidID11861);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValidID11872); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:5039:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:5042:28: (this_ID_0= RULE_ID )
            // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:5043:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValidID11911); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"

    // $ANTLR start synpred1_InternalGuixDsl
    public final void synpred1_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:410:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:410:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:410:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:410:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:410:5: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:411:1: 
        {
        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:411:2: ( ( ruleOpMultiAssign ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:412:1: ( ruleOpMultiAssign )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:412:1: ( ruleOpMultiAssign )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:413:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGuixDsl883);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalGuixDsl

    // $ANTLR start synpred2_InternalGuixDsl
    public final void synpred2_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:538:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:538:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:538:4: ( () ( ( ruleOpOr ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:538:5: () ( ( ruleOpOr ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:538:5: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:539:1: 
        {
        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:539:2: ( ( ruleOpOr ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:540:1: ( ruleOpOr )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:540:1: ( ruleOpOr )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:541:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred2_InternalGuixDsl1231);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalGuixDsl

    // $ANTLR start synpred3_InternalGuixDsl
    public final void synpred3_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:639:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:639:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:639:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:639:5: () ( ( ruleOpAnd ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:639:5: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:640:1: 
        {
        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:640:2: ( ( ruleOpAnd ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:641:1: ( ruleOpAnd )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:641:1: ( ruleOpAnd )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:642:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred3_InternalGuixDsl1490);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalGuixDsl

    // $ANTLR start synpred4_InternalGuixDsl
    public final void synpred4_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:740:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:740:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:740:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:740:5: () ( ( ruleOpEquality ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:740:5: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:741:1: 
        {
        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:741:2: ( ( ruleOpEquality ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:742:1: ( ruleOpEquality )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:742:1: ( ruleOpEquality )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:743:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred4_InternalGuixDsl1749);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalGuixDsl

    // $ANTLR start synpred5_InternalGuixDsl
    public final void synpred5_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:848:4: ( ( () 'instanceof' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:848:5: ( () 'instanceof' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:848:5: ( () 'instanceof' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:848:6: () 'instanceof'
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:848:6: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:849:1: 
        {
        }

        match(input,24,FOLLOW_24_in_synpred5_InternalGuixDsl2025); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalGuixDsl

    // $ANTLR start synpred6_InternalGuixDsl
    public final void synpred6_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:879:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:879:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:879:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:879:10: () ( ( ruleOpCompare ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:879:10: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:880:1: 
        {
        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:880:2: ( ( ruleOpCompare ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:881:1: ( ruleOpCompare )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:881:1: ( ruleOpCompare )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:882:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred6_InternalGuixDsl2096);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred6_InternalGuixDsl

    // $ANTLR start synpred7_InternalGuixDsl
    public final void synpred7_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1001:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1001:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1001:4: ( () ( ( ruleOpOther ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1001:5: () ( ( ruleOpOther ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1001:5: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1002:1: 
        {
        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1002:2: ( ( ruleOpOther ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1003:1: ( ruleOpOther )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1003:1: ( ruleOpOther )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1004:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred7_InternalGuixDsl2415);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalGuixDsl

    // $ANTLR start synpred8_InternalGuixDsl
    public final void synpred8_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1093:3: ( ( '>' '>' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1093:4: ( '>' '>' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1093:4: ( '>' '>' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1094:2: '>' '>'
        {
        match(input,27,FOLLOW_27_in_synpred8_InternalGuixDsl2631); if (state.failed) return ;
        match(input,27,FOLLOW_27_in_synpred8_InternalGuixDsl2636); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalGuixDsl

    // $ANTLR start synpred9_InternalGuixDsl
    public final void synpred9_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1123:3: ( ( '<' '<' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1123:4: ( '<' '<' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1123:4: ( '<' '<' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1124:2: '<' '<'
        {
        match(input,28,FOLLOW_28_in_synpred9_InternalGuixDsl2718); if (state.failed) return ;
        match(input,28,FOLLOW_28_in_synpred9_InternalGuixDsl2723); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalGuixDsl

    // $ANTLR start synpred10_InternalGuixDsl
    public final void synpred10_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1197:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1197:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1197:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1197:5: () ( ( ruleOpAdd ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1197:5: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1198:1: 
        {
        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1198:2: ( ( ruleOpAdd ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1199:1: ( ruleOpAdd )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1199:1: ( ruleOpAdd )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1200:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred10_InternalGuixDsl2945);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalGuixDsl

    // $ANTLR start synpred11_InternalGuixDsl
    public final void synpred11_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1305:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1305:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1305:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1305:5: () ( ( ruleOpMulti ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1305:5: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1306:1: 
        {
        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1306:2: ( ( ruleOpMulti ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1307:1: ( ruleOpMulti )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1307:1: ( ruleOpMulti )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1308:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred11_InternalGuixDsl3225);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalGuixDsl

    // $ANTLR start synpred12_InternalGuixDsl
    public final void synpred12_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1538:3: ( ( () 'as' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1538:4: ( () 'as' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1538:4: ( () 'as' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1538:5: () 'as'
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1538:5: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1539:1: 
        {
        }

        match(input,42,FOLLOW_42_in_synpred12_InternalGuixDsl3819); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalGuixDsl

    // $ANTLR start synpred13_InternalGuixDsl
    public final void synpred13_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1598:4: ( ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1598:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1598:5: ( () '.' ( ( ruleValidID ) ) ruleOpSingleAssign )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1598:6: () '.' ( ( ruleValidID ) ) ruleOpSingleAssign
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1598:6: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1599:1: 
        {
        }

        match(input,43,FOLLOW_43_in_synpred13_InternalGuixDsl3973); if (state.failed) return ;
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1600:1: ( ( ruleValidID ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1601:1: ( ruleValidID )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1601:1: ( ruleValidID )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1602:3: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred13_InternalGuixDsl3982);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred13_InternalGuixDsl3988);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalGuixDsl

    // $ANTLR start synpred14_InternalGuixDsl
    public final void synpred14_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1656:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1656:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1656:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1656:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1656:10: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1657:1: 
        {
        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1657:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt90=3;
        switch ( input.LA(1) ) {
        case 43:
            {
            alt90=1;
            }
            break;
        case 44:
            {
            alt90=2;
            }
            break;
        case 45:
            {
            alt90=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 90, 0, input);

            throw nvae;
        }

        switch (alt90) {
            case 1 :
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1657:4: '.'
                {
                match(input,43,FOLLOW_43_in_synpred14_InternalGuixDsl4091); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1659:6: ( ( '?.' ) )
                {
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1659:6: ( ( '?.' ) )
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1660:1: ( '?.' )
                {
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1660:1: ( '?.' )
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1661:2: '?.'
                {
                match(input,44,FOLLOW_44_in_synpred14_InternalGuixDsl4105); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1666:6: ( ( '*.' ) )
                {
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1666:6: ( ( '*.' ) )
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1667:1: ( '*.' )
                {
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1667:1: ( '*.' )
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1668:2: '*.'
                {
                match(input,45,FOLLOW_45_in_synpred14_InternalGuixDsl4125); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred14_InternalGuixDsl

    // $ANTLR start synpred15_InternalGuixDsl
    public final void synpred15_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1777:4: ( ( '(' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1778:1: ( '(' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1778:1: ( '(' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1779:2: '('
        {
        match(input,47,FOLLOW_47_in_synpred15_InternalGuixDsl4352); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalGuixDsl

    // $ANTLR start synpred16_InternalGuixDsl
    public final void synpred16_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1798:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1798:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1798:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1798:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1798:6: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1799:1: 
        {
        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1799:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt92=2;
        int LA92_0 = input.LA(1);

        if ( (LA92_0==RULE_ID||LA92_0==31||LA92_0==47) ) {
            alt92=1;
        }
        switch (alt92) {
            case 1 :
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1799:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1799:3: ( ( ruleJvmFormalParameter ) )
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1800:1: ( ruleJvmFormalParameter )
                {
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1800:1: ( ruleJvmFormalParameter )
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1801:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGuixDsl4404);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1803:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop91:
                do {
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==46) ) {
                        alt91=1;
                    }


                    switch (alt91) {
                	case 1 :
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1803:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,46,FOLLOW_46_in_synpred16_InternalGuixDsl4411); if (state.failed) return ;
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1804:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1805:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1805:1: ( ruleJvmFormalParameter )
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1806:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGuixDsl4418);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop91;
                    }
                } while (true);


                }
                break;

        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1808:6: ( ( '|' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1809:1: ( '|' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1809:1: ( '|' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1810:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred16_InternalGuixDsl4432); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred16_InternalGuixDsl

    // $ANTLR start synpred17_InternalGuixDsl
    public final void synpred17_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1877:4: ( ( () '[' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1877:5: ( () '[' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1877:5: ( () '[' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1877:6: () '['
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1877:6: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:1878:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred17_InternalGuixDsl4552); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalGuixDsl

    // $ANTLR start synpred18_InternalGuixDsl
    public final void synpred18_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2068:3: ( ( () '[' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2068:4: ( () '[' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2068:4: ( () '[' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2068:5: () '['
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2068:5: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2069:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred18_InternalGuixDsl5076); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalGuixDsl

    // $ANTLR start synpred20_InternalGuixDsl
    public final void synpred20_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2162:4: ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2162:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2162:5: ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2162:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2162:6: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt94=2;
        int LA94_0 = input.LA(1);

        if ( (LA94_0==RULE_ID||LA94_0==31||LA94_0==47) ) {
            alt94=1;
        }
        switch (alt94) {
            case 1 :
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2162:7: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2162:7: ( ( ruleJvmFormalParameter ) )
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2163:1: ( ruleJvmFormalParameter )
                {
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2163:1: ( ruleJvmFormalParameter )
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2164:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGuixDsl5355);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2166:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop93:
                do {
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==46) ) {
                        alt93=1;
                    }


                    switch (alt93) {
                	case 1 :
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2166:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,46,FOLLOW_46_in_synpred20_InternalGuixDsl5362); if (state.failed) return ;
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2167:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2168:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2168:1: ( ruleJvmFormalParameter )
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2169:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGuixDsl5369);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop93;
                    }
                } while (true);


                }
                break;

        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2171:6: ( ( '|' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2172:1: ( '|' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2172:1: ( '|' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2173:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred20_InternalGuixDsl5383); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalGuixDsl

    // $ANTLR start synpred22_InternalGuixDsl
    public final void synpred22_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2532:4: ( 'else' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2532:6: 'else'
        {
        match(input,54,FOLLOW_54_in_synpred22_InternalGuixDsl6166); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalGuixDsl

    // $ANTLR start synpred23_InternalGuixDsl
    public final void synpred23_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2586:4: ( ( ( ( ruleValidID ) ) ':' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2586:5: ( ( ( ruleValidID ) ) ':' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2586:5: ( ( ( ruleValidID ) ) ':' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2586:6: ( ( ruleValidID ) ) ':'
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2586:6: ( ( ruleValidID ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2587:1: ( ruleValidID )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2587:1: ( ruleValidID )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2588:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred23_InternalGuixDsl6308);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,56,FOLLOW_56_in_synpred23_InternalGuixDsl6314); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalGuixDsl

    // $ANTLR start synpred24_InternalGuixDsl
    public final void synpred24_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2632:8: ( ( '(' ( ( ruleValidID ) ) ':' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2632:9: ( '(' ( ( ruleValidID ) ) ':' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2632:9: ( '(' ( ( ruleValidID ) ) ':' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2632:11: '(' ( ( ruleValidID ) ) ':'
        {
        match(input,47,FOLLOW_47_in_synpred24_InternalGuixDsl6390); if (state.failed) return ;
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2633:1: ( ( ruleValidID ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2634:1: ( ruleValidID )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2634:1: ( ruleValidID )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:2635:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred24_InternalGuixDsl6397);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,56,FOLLOW_56_in_synpred24_InternalGuixDsl6403); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred24_InternalGuixDsl

    // $ANTLR start synpred25_InternalGuixDsl
    public final void synpred25_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3216:4: ( ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3216:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3216:5: ( ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3216:6: ( ( ruleJvmTypeReference ) ) ( ( ruleValidID ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3216:6: ( ( ruleJvmTypeReference ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3217:1: ( ruleJvmTypeReference )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3217:1: ( ruleJvmTypeReference )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3218:1: ruleJvmTypeReference
        {
        pushFollow(FOLLOW_ruleJvmTypeReference_in_synpred25_InternalGuixDsl7668);
        ruleJvmTypeReference();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3220:2: ( ( ruleValidID ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3221:1: ( ruleValidID )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3221:1: ( ruleValidID )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3222:1: ruleValidID
        {
        pushFollow(FOLLOW_ruleValidID_in_synpred25_InternalGuixDsl7677);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalGuixDsl

    // $ANTLR start synpred26_InternalGuixDsl
    public final void synpred26_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3520:4: ( ( '(' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3521:1: ( '(' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3521:1: ( '(' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3522:2: '('
        {
        match(input,47,FOLLOW_47_in_synpred26_InternalGuixDsl8239); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalGuixDsl

    // $ANTLR start synpred27_InternalGuixDsl
    public final void synpred27_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3541:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3541:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3541:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3541:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3541:6: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3542:1: 
        {
        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3542:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt98=2;
        int LA98_0 = input.LA(1);

        if ( (LA98_0==RULE_ID||LA98_0==31||LA98_0==47) ) {
            alt98=1;
        }
        switch (alt98) {
            case 1 :
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3542:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3542:3: ( ( ruleJvmFormalParameter ) )
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3543:1: ( ruleJvmFormalParameter )
                {
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3543:1: ( ruleJvmFormalParameter )
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3544:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalGuixDsl8291);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3546:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop97:
                do {
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==46) ) {
                        alt97=1;
                    }


                    switch (alt97) {
                	case 1 :
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3546:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,46,FOLLOW_46_in_synpred27_InternalGuixDsl8298); if (state.failed) return ;
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3547:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3548:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3548:1: ( ruleJvmFormalParameter )
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3549:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalGuixDsl8305);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop97;
                    }
                } while (true);


                }
                break;

        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3551:6: ( ( '|' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3552:1: ( '|' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3552:1: ( '|' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3553:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred27_InternalGuixDsl8319); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred27_InternalGuixDsl

    // $ANTLR start synpred28_InternalGuixDsl
    public final void synpred28_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3620:4: ( ( () '[' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3620:5: ( () '[' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3620:5: ( () '[' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3620:6: () '['
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3620:6: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3621:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred28_InternalGuixDsl8439); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred28_InternalGuixDsl

    // $ANTLR start synpred29_InternalGuixDsl
    public final void synpred29_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3763:4: ( '<' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3763:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred29_InternalGuixDsl8826); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalGuixDsl

    // $ANTLR start synpred30_InternalGuixDsl
    public final void synpred30_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3812:5: ( '(' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3812:7: '('
        {
        match(input,47,FOLLOW_47_in_synpred30_InternalGuixDsl8919); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalGuixDsl

    // $ANTLR start synpred31_InternalGuixDsl
    public final void synpred31_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3817:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3817:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3817:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3817:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3817:6: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3818:1: 
        {
        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3818:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt100=2;
        int LA100_0 = input.LA(1);

        if ( (LA100_0==RULE_ID||LA100_0==31||LA100_0==47) ) {
            alt100=1;
        }
        switch (alt100) {
            case 1 :
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3818:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3818:3: ( ( ruleJvmFormalParameter ) )
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3819:1: ( ruleJvmFormalParameter )
                {
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3819:1: ( ruleJvmFormalParameter )
                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3820:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalGuixDsl8949);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3822:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop99:
                do {
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==46) ) {
                        alt99=1;
                    }


                    switch (alt99) {
                	case 1 :
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3822:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,46,FOLLOW_46_in_synpred31_InternalGuixDsl8956); if (state.failed) return ;
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3823:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3824:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3824:1: ( ruleJvmFormalParameter )
                	    // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3825:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalGuixDsl8963);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop99;
                    }
                } while (true);


                }
                break;

        }

        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3827:6: ( ( '|' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3828:1: ( '|' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3828:1: ( '|' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3829:2: '|'
        {
        match(input,50,FOLLOW_50_in_synpred31_InternalGuixDsl8977); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred31_InternalGuixDsl

    // $ANTLR start synpred32_InternalGuixDsl
    public final void synpred32_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3896:4: ( ( () '[' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3896:5: ( () '[' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3896:5: ( () '[' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3896:6: () '['
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3896:6: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:3897:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred32_InternalGuixDsl9097); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred32_InternalGuixDsl

    // $ANTLR start synpred33_InternalGuixDsl
    public final void synpred33_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4218:2: ( ( ruleXExpression ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4219:1: ( ruleXExpression )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4219:1: ( ruleXExpression )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4220:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred33_InternalGuixDsl9899);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred33_InternalGuixDsl

    // $ANTLR start synpred34_InternalGuixDsl
    public final void synpred34_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4289:5: ( 'catch' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4289:7: 'catch'
        {
        match(input,75,FOLLOW_75_in_synpred34_InternalGuixDsl10044); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_InternalGuixDsl

    // $ANTLR start synpred35_InternalGuixDsl
    public final void synpred35_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4308:5: ( 'finally' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4308:7: 'finally'
        {
        match(input,74,FOLLOW_74_in_synpred35_InternalGuixDsl10074); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_InternalGuixDsl

    // $ANTLR start synpred37_InternalGuixDsl
    public final void synpred37_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4456:3: ( '.' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4457:2: '.'
        {
        match(input,43,FOLLOW_43_in_synpred37_InternalGuixDsl10421); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalGuixDsl

    // $ANTLR start synpred38_InternalGuixDsl
    public final void synpred38_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4580:2: ( ( () '[' ']' ) )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4580:3: ( () '[' ']' )
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4580:3: ( () '[' ']' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4580:4: () '[' ']'
        {
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4580:4: ()
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4581:1: 
        {
        }

        match(input,49,FOLLOW_49_in_synpred38_InternalGuixDsl10804); if (state.failed) return ;
        match(input,51,FOLLOW_51_in_synpred38_InternalGuixDsl10808); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalGuixDsl

    // $ANTLR start synpred39_InternalGuixDsl
    public final void synpred39_InternalGuixDsl_fragment() throws RecognitionException {   
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4734:4: ( '<' )
        // ../org.guixdsl/src-gen/org/parser/antlr/internal/InternalGuixDsl.g:4734:6: '<'
        {
        match(input,28,FOLLOW_28_in_synpred39_InternalGuixDsl11168); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalGuixDsl

    // Delegated rules

    public final boolean synpred38_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalGuixDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalGuixDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA70 dfa70 = new DFA70(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA87 dfa87 = new DFA87(this);
    static final String DFA14_eotS =
        "\13\uffff";
    static final String DFA14_eofS =
        "\1\1\12\uffff";
    static final String DFA14_minS =
        "\1\4\1\uffff\10\0\1\uffff";
    static final String DFA14_maxS =
        "\1\113\1\uffff\10\0\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA14_specialS =
        "\2\uffff\1\2\1\1\1\5\1\4\1\0\1\7\1\6\1\3\1\uffff}>";
    static final String[] DFA14_transitionS = {
            "\5\1\5\uffff\1\1\2\uffff\1\1\1\uffff\10\1\1\2\1\3\1\4\1\5\1"+
            "\6\1\7\1\10\1\11\17\1\1\uffff\16\1\1\uffff\12\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()* loopback of 1001:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuixDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuixDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuixDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_9 = input.LA(1);

                         
                        int index14_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuixDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuixDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuixDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuixDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalGuixDsl()) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\101\uffff";
    static final String DFA30_eofS =
        "\1\2\100\uffff";
    static final String DFA30_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA30_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA30_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA30_transitionS = {
            "\5\2\5\uffff\1\2\2\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\16"+
            "\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1777:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\36\uffff";
    static final String DFA29_eofS =
        "\36\uffff";
    static final String DFA29_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA29_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA29_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA29_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\5\1\1\3\5\5\uffff\1\5\15\uffff\1\5\2\uffff\1\3\3\uffff\2"+
            "\5\4\uffff\1\5\5\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1798:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_0==RULE_ID) ) {s = 1;}

                        else if ( (LA29_0==47) ) {s = 2;}

                        else if ( (LA29_0==31) && (synpred16_InternalGuixDsl())) {s = 3;}

                        else if ( (LA29_0==50) && (synpred16_InternalGuixDsl())) {s = 4;}

                        else if ( (LA29_0==RULE_STRING||(LA29_0>=RULE_HEX && LA29_0<=RULE_DECIMAL)||LA29_0==14||LA29_0==28||(LA29_0>=35 && LA29_0<=36)||LA29_0==41||LA29_0==49||LA29_0==53||LA29_0==55||(LA29_0>=59 && LA29_0<=61)||LA29_0==64||(LA29_0>=66 && LA29_0<=73)) ) {s = 5;}

                        else if ( (LA29_0==48) ) {s = 29;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalGuixDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalGuixDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA31_eotS =
        "\101\uffff";
    static final String DFA31_eofS =
        "\1\2\100\uffff";
    static final String DFA31_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA31_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA31_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA31_transitionS = {
            "\5\2\5\uffff\1\2\2\uffff\1\2\1\uffff\36\2\1\1\1\uffff\16\2\1"+
            "\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1877:3: ( ( ( () '[' ) )=> (lv_memberCallArguments_22_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA33_eotS =
        "\16\uffff";
    static final String DFA33_eofS =
        "\16\uffff";
    static final String DFA33_minS =
        "\1\4\15\uffff";
    static final String DFA33_maxS =
        "\1\111\15\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA33_specialS =
        "\16\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\5\1\4\3\5\5\uffff\1\2\15\uffff\1\4\22\uffff\1\15\1\uffff"+
            "\1\5\3\uffff\1\6\1\uffff\1\3\3\uffff\1\7\1\10\1\11\2\uffff\1"+
            "\4\1\uffff\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1918:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA37_eotS =
        "\40\uffff";
    static final String DFA37_eofS =
        "\40\uffff";
    static final String DFA37_minS =
        "\1\4\2\0\35\uffff";
    static final String DFA37_maxS =
        "\1\111\2\0\35\uffff";
    static final String DFA37_acceptS =
        "\3\uffff\2\1\1\2\32\uffff";
    static final String DFA37_specialS =
        "\1\0\1\1\1\2\35\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\5\1\1\3\5\5\uffff\1\5\15\uffff\1\5\2\uffff\1\3\3\uffff\2"+
            "\5\4\uffff\1\5\5\uffff\1\2\1\uffff\1\5\1\4\1\5\1\uffff\1\5\1"+
            "\uffff\1\5\3\uffff\6\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "2162:3: ( ( ( ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> ( ( ( (lv_declaredFormalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_declaredFormalParameters_4_0= ruleJvmFormalParameter ) ) )* )? ( (lv_explicitSyntax_5_0= '|' ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_0 = input.LA(1);

                         
                        int index37_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA37_0==RULE_ID) ) {s = 1;}

                        else if ( (LA37_0==47) ) {s = 2;}

                        else if ( (LA37_0==31) && (synpred20_InternalGuixDsl())) {s = 3;}

                        else if ( (LA37_0==50) && (synpred20_InternalGuixDsl())) {s = 4;}

                        else if ( (LA37_0==RULE_STRING||(LA37_0>=RULE_HEX && LA37_0<=RULE_DECIMAL)||LA37_0==14||LA37_0==28||(LA37_0>=35 && LA37_0<=36)||LA37_0==41||LA37_0==49||LA37_0==51||LA37_0==53||LA37_0==55||(LA37_0>=59 && LA37_0<=64)||(LA37_0>=66 && LA37_0<=73)) ) {s = 5;}

                         
                        input.seek(index37_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGuixDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalGuixDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\101\uffff";
    static final String DFA61_eofS =
        "\1\2\100\uffff";
    static final String DFA61_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA61_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA61_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA61_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA61_transitionS = {
            "\5\2\5\uffff\1\2\2\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\16"+
            "\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "3520:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA60_eotS =
        "\36\uffff";
    static final String DFA60_eofS =
        "\36\uffff";
    static final String DFA60_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA60_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA60_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA60_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\5\1\1\3\5\5\uffff\1\5\15\uffff\1\5\2\uffff\1\3\3\uffff\2"+
            "\5\4\uffff\1\5\5\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "3541:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_0 = input.LA(1);

                         
                        int index60_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA60_0==RULE_ID) ) {s = 1;}

                        else if ( (LA60_0==47) ) {s = 2;}

                        else if ( (LA60_0==31) && (synpred27_InternalGuixDsl())) {s = 3;}

                        else if ( (LA60_0==50) && (synpred27_InternalGuixDsl())) {s = 4;}

                        else if ( (LA60_0==RULE_STRING||(LA60_0>=RULE_HEX && LA60_0<=RULE_DECIMAL)||LA60_0==14||LA60_0==28||(LA60_0>=35 && LA60_0<=36)||LA60_0==41||LA60_0==49||LA60_0==53||LA60_0==55||(LA60_0>=59 && LA60_0<=61)||LA60_0==64||(LA60_0>=66 && LA60_0<=73)) ) {s = 5;}

                        else if ( (LA60_0==48) ) {s = 29;}

                         
                        input.seek(index60_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalGuixDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_2 = input.LA(1);

                         
                        int index60_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred27_InternalGuixDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index60_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\101\uffff";
    static final String DFA62_eofS =
        "\1\2\100\uffff";
    static final String DFA62_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA62_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA62_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA62_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA62_transitionS = {
            "\5\2\5\uffff\1\2\2\uffff\1\2\1\uffff\36\2\1\1\1\uffff\16\2\1"+
            "\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "3620:3: ( ( ( () '[' ) )=> (lv_featureCallArguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_1 = input.LA(1);

                         
                        int index62_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index62_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA66_eotS =
        "\101\uffff";
    static final String DFA66_eofS =
        "\1\2\100\uffff";
    static final String DFA66_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA66_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA66_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA66_transitionS = {
            "\5\2\5\uffff\1\2\2\uffff\1\2\1\uffff\11\2\1\1\25\2\1\uffff\16"+
            "\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "3763:2: ( ( ( '<' )=>otherlv_3= '<' ) ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_1 = input.LA(1);

                         
                        int index66_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index66_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA69_eotS =
        "\101\uffff";
    static final String DFA69_eofS =
        "\1\2\100\uffff";
    static final String DFA69_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA69_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA69_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA69_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA69_transitionS = {
            "\5\2\5\uffff\1\2\2\uffff\1\2\1\uffff\34\2\1\1\2\2\1\uffff\16"+
            "\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA69_eot = DFA.unpackEncodedString(DFA69_eotS);
    static final short[] DFA69_eof = DFA.unpackEncodedString(DFA69_eofS);
    static final char[] DFA69_min = DFA.unpackEncodedStringToUnsignedChars(DFA69_minS);
    static final char[] DFA69_max = DFA.unpackEncodedStringToUnsignedChars(DFA69_maxS);
    static final short[] DFA69_accept = DFA.unpackEncodedString(DFA69_acceptS);
    static final short[] DFA69_special = DFA.unpackEncodedString(DFA69_specialS);
    static final short[][] DFA69_transition;

    static {
        int numStates = DFA69_transitionS.length;
        DFA69_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA69_transition[i] = DFA.unpackEncodedString(DFA69_transitionS[i]);
        }
    }

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = DFA69_eot;
            this.eof = DFA69_eof;
            this.min = DFA69_min;
            this.max = DFA69_max;
            this.accept = DFA69_accept;
            this.special = DFA69_special;
            this.transition = DFA69_transition;
        }
        public String getDescription() {
            return "3812:3: ( ( ( '(' )=>otherlv_8= '(' ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred30_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA68_eotS =
        "\36\uffff";
    static final String DFA68_eofS =
        "\36\uffff";
    static final String DFA68_minS =
        "\1\4\2\0\33\uffff";
    static final String DFA68_maxS =
        "\1\111\2\0\33\uffff";
    static final String DFA68_acceptS =
        "\3\uffff\2\1\1\2\27\uffff\1\3";
    static final String DFA68_specialS =
        "\1\0\1\1\1\2\33\uffff}>";
    static final String[] DFA68_transitionS = {
            "\1\5\1\1\3\5\5\uffff\1\5\15\uffff\1\5\2\uffff\1\3\3\uffff\2"+
            "\5\4\uffff\1\5\5\uffff\1\2\1\35\1\5\1\4\2\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\3\5\2\uffff\1\5\1\uffff\10\5",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
    static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
    static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
    static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
    static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
    static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
    static final short[][] DFA68_transition;

    static {
        int numStates = DFA68_transitionS.length;
        DFA68_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
        }
    }

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = DFA68_eot;
            this.eof = DFA68_eof;
            this.min = DFA68_min;
            this.max = DFA68_max;
            this.accept = DFA68_accept;
            this.special = DFA68_special;
            this.transition = DFA68_transition;
        }
        public String getDescription() {
            return "3817:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? ( ( '|' ) ) ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA68_0 = input.LA(1);

                         
                        int index68_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA68_0==RULE_ID) ) {s = 1;}

                        else if ( (LA68_0==47) ) {s = 2;}

                        else if ( (LA68_0==31) && (synpred31_InternalGuixDsl())) {s = 3;}

                        else if ( (LA68_0==50) && (synpred31_InternalGuixDsl())) {s = 4;}

                        else if ( (LA68_0==RULE_STRING||(LA68_0>=RULE_HEX && LA68_0<=RULE_DECIMAL)||LA68_0==14||LA68_0==28||(LA68_0>=35 && LA68_0<=36)||LA68_0==41||LA68_0==49||LA68_0==53||LA68_0==55||(LA68_0>=59 && LA68_0<=61)||LA68_0==64||(LA68_0>=66 && LA68_0<=73)) ) {s = 5;}

                        else if ( (LA68_0==48) ) {s = 29;}

                         
                        input.seek(index68_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA68_1 = input.LA(1);

                         
                        int index68_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuixDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index68_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA68_2 = input.LA(1);

                         
                        int index68_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred31_InternalGuixDsl()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index68_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 68, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA70_eotS =
        "\101\uffff";
    static final String DFA70_eofS =
        "\1\2\100\uffff";
    static final String DFA70_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA70_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA70_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA70_transitionS = {
            "\5\2\5\uffff\1\2\2\uffff\1\2\1\uffff\36\2\1\1\1\uffff\16\2\1"+
            "\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "3896:3: ( ( ( () '[' ) )=> (lv_arguments_14_0= ruleXClosure ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_1 = input.LA(1);

                         
                        int index70_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index70_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA72_eotS =
        "\101\uffff";
    static final String DFA72_eofS =
        "\1\33\100\uffff";
    static final String DFA72_minS =
        "\1\4\32\0\46\uffff";
    static final String DFA72_maxS =
        "\1\113\32\0\46\uffff";
    static final String DFA72_acceptS =
        "\33\uffff\1\2\44\uffff\1\1";
    static final String DFA72_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\46\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\21\1\1\1\15\1\16\1\17\5\uffff\1\6\2\uffff\1\33\1\uffff\11"+
            "\33\1\10\6\33\1\4\1\3\4\33\1\2\5\33\1\32\1\33\1\12\1\uffff\2"+
            "\33\1\23\1\33\1\7\3\33\1\24\1\25\1\26\2\33\1\11\1\uffff\1\5"+
            "\1\13\1\14\1\20\1\22\1\27\1\30\1\31\2\33",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4218:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_3 = input.LA(1);

                         
                        int index72_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA72_4 = input.LA(1);

                         
                        int index72_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA72_5 = input.LA(1);

                         
                        int index72_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA72_6 = input.LA(1);

                         
                        int index72_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA72_7 = input.LA(1);

                         
                        int index72_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA72_8 = input.LA(1);

                         
                        int index72_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA72_9 = input.LA(1);

                         
                        int index72_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA72_10 = input.LA(1);

                         
                        int index72_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA72_11 = input.LA(1);

                         
                        int index72_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA72_12 = input.LA(1);

                         
                        int index72_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA72_13 = input.LA(1);

                         
                        int index72_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA72_14 = input.LA(1);

                         
                        int index72_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA72_15 = input.LA(1);

                         
                        int index72_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA72_16 = input.LA(1);

                         
                        int index72_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA72_17 = input.LA(1);

                         
                        int index72_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA72_18 = input.LA(1);

                         
                        int index72_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA72_19 = input.LA(1);

                         
                        int index72_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA72_20 = input.LA(1);

                         
                        int index72_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA72_21 = input.LA(1);

                         
                        int index72_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA72_22 = input.LA(1);

                         
                        int index72_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA72_23 = input.LA(1);

                         
                        int index72_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA72_24 = input.LA(1);

                         
                        int index72_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA72_25 = input.LA(1);

                         
                        int index72_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA72_26 = input.LA(1);

                         
                        int index72_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred33_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 27;}

                         
                        input.seek(index72_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA87_eotS =
        "\101\uffff";
    static final String DFA87_eofS =
        "\1\2\100\uffff";
    static final String DFA87_minS =
        "\1\4\1\0\77\uffff";
    static final String DFA87_maxS =
        "\1\113\1\0\77\uffff";
    static final String DFA87_acceptS =
        "\2\uffff\1\2\75\uffff\1\1";
    static final String DFA87_specialS =
        "\1\uffff\1\0\77\uffff}>";
    static final String[] DFA87_transitionS = {
            "\5\2\5\uffff\1\2\2\uffff\1\2\1\uffff\11\2\1\1\25\2\1\uffff\16"+
            "\2\1\uffff\12\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA87_eot = DFA.unpackEncodedString(DFA87_eotS);
    static final short[] DFA87_eof = DFA.unpackEncodedString(DFA87_eofS);
    static final char[] DFA87_min = DFA.unpackEncodedStringToUnsignedChars(DFA87_minS);
    static final char[] DFA87_max = DFA.unpackEncodedStringToUnsignedChars(DFA87_maxS);
    static final short[] DFA87_accept = DFA.unpackEncodedString(DFA87_acceptS);
    static final short[] DFA87_special = DFA.unpackEncodedString(DFA87_specialS);
    static final short[][] DFA87_transition;

    static {
        int numStates = DFA87_transitionS.length;
        DFA87_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA87_transition[i] = DFA.unpackEncodedString(DFA87_transitionS[i]);
        }
    }

    class DFA87 extends DFA {

        public DFA87(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 87;
            this.eot = DFA87_eot;
            this.eof = DFA87_eof;
            this.min = DFA87_min;
            this.max = DFA87_max;
            this.accept = DFA87_accept;
            this.special = DFA87_special;
            this.transition = DFA87_transition;
        }
        public String getDescription() {
            return "4734:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA87_1 = input.LA(1);

                         
                        int index87_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_InternalGuixDsl()) ) {s = 64;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index87_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 87, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleDslModel_in_entryRuleDslModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDslModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDslAbstractGuiElement_in_ruleDslModel130 = new BitSet(new long[]{0x0000000000042012L});
    public static final BitSet FOLLOW_ruleDslAbstractGuiElement_in_entryRuleDslAbstractGuiElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDslAbstractGuiElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDslGuiModule_in_ruleDslAbstractGuiElement223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDslView_in_ruleDslAbstractGuiElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDslGuiModule_in_entryRuleDslGuiModule285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDslGuiModule295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDslGuiModule337 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDslGuiModule355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDslGuiModule372 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDslGuiModule389 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_ruleDslGuiModule402 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleDslGuiModule414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDslGuiModule431 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDslGuiModule450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDslView_in_entryRuleDslView486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDslView496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDslView538 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDslView556 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDslView573 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDslView590 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDslView602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXAssignment796 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment812 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment862 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment915 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleOpSingleAssign1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpMultiAssign1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1210 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1263 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1286 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpOr1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1469 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1522 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1545 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpAnd1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1728 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression1781 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression1804 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality1843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleOpEquality1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpEquality1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression1951 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2008 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_24_in_ruleXRelationalExpression2044 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXRelationalExpression2067 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2128 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2151 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpCompare2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpCompare2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2394 = new BitSet(new long[]{0x00000007F8000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2447 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2470 = new BitSet(new long[]{0x00000007F8000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpOther2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpOther2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpOther2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2616 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2647 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2703 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2734 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpOther2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpOther2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpOther2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2924 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression2977 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3000 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpAdd3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpAdd3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3204 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3257 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3280 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleOpMulti3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleOpMulti3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleOpMulti3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOpMulti3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3533 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleOpUnary3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleOpUnary3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3803 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleXCastedExpression3838 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3861 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3956 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4028 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4044 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4066 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_43_in_ruleXMemberFeatureCall4152 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_44_in_ruleXMemberFeatureCall4176 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_45_in_ruleXMemberFeatureCall4213 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_28_in_ruleXMemberFeatureCall4242 = new BitSet(new long[]{0x0000800080000020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4263 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4276 = new BitSet(new long[]{0x0000800080000020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4297 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_27_in_ruleXMemberFeatureCall4311 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXMemberFeatureCall4336 = new BitSet(new long[]{0x0002B80000000002L});
    public static final BitSet FOLLOW_47_in_ruleXMemberFeatureCall4370 = new BitSet(new long[]{0x38A78218900041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4455 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4483 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXMemberFeatureCall4496 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4517 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_48_in_ruleXMemberFeatureCall4534 = new BitSet(new long[]{0x0002380000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXMemberFeatureCall4569 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_ruleXLiteral5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXClosure5336 = new BitSet(new long[]{0xF8AE8218900041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5409 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXClosure5422 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5443 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_ruleXClosure5465 = new BitSet(new long[]{0xF8AA8218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_ruleXClosure5502 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleXClosure5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInClosure_in_entryRuleXExpressionInClosure5550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInClosure5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXExpressionInClosure5616 = new BitSet(new long[]{0xF8B28218100041F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_52_in_ruleXExpressionInClosure5629 = new BitSet(new long[]{0xF8A28218100041F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5787 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXShortClosure5800 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5821 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_ruleXShortClosure5843 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXParenthesizedExpression5962 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5984 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXParenthesizedExpression5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression6031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression6041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXIfExpression6087 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXIfExpression6099 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6120 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXIfExpression6132 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6153 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleXIfExpression6174 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression6234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression6244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleXSwitchExpression6290 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6333 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6345 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6369 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression6413 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXSwitchExpression6434 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6446 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6469 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6481 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXSwitchExpression6495 = new BitSet(new long[]{0x0500800080000020L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6516 = new BitSet(new long[]{0x0700800080020020L});
    public static final BitSet FOLLOW_57_in_ruleXSwitchExpression6530 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXSwitchExpression6542 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6563 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleXSwitchExpression6577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6669 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_58_in_ruleXCasePart6683 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6704 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXCasePart6718 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXForLoopExpression6831 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXForLoopExpression6843 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6864 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleXForLoopExpression6876 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6897 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXForLoopExpression6909 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXWhileExpression7022 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXWhileExpression7034 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7055 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXWhileExpression7067 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression7124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXDoWhileExpression7180 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7201 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ruleXDoWhileExpression7213 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXDoWhileExpression7225 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression7246 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXDoWhileExpression7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression7294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression7304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleXBlockExpression7350 = new BitSet(new long[]{0xF8A28218100241F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_ruleXBlockExpression7372 = new BitSet(new long[]{0xF8B28218100241F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_52_in_ruleXBlockExpression7385 = new BitSet(new long[]{0xF8A28218100241F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_17_in_ruleXBlockExpression7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpressionInsideBlock_in_entryRuleXExpressionInsideBlock7437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpressionInsideBlock7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleXExpressionInsideBlock7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXExpressionInsideBlock7521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration7556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration7566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXVariableDeclaration7619 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_63_in_ruleXVariableDeclaration7650 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration7698 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7719 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleXVariableDeclaration7748 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleXVariableDeclaration7762 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter7821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter7877 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleJvmFormalParameter7899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_entryRuleFullJvmFormalParameter7935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFullJvmFormalParameter7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleFullJvmFormalParameter7991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleFullJvmFormalParameter8012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall8048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall8058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall8115 = new BitSet(new long[]{0x0000000010000020L,0x0000000000000001L});
    public static final BitSet FOLLOW_28_in_ruleXFeatureCall8129 = new BitSet(new long[]{0x0000800080000020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8150 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_46_in_ruleXFeatureCall8163 = new BitSet(new long[]{0x0000800080000020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall8184 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_27_in_ruleXFeatureCall8198 = new BitSet(new long[]{0x0000000010000020L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall8223 = new BitSet(new long[]{0x0002800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXFeatureCall8257 = new BitSet(new long[]{0x38A78218900041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall8342 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8370 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXFeatureCall8383 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall8404 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_48_in_ruleXFeatureCall8421 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXFeatureCall8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper8494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleIdOrSuper8552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleIdOrSuper8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier8617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier8628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleStaticQualifier8675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStaticQualifier8693 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall8734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall8744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleXConstructorCall8790 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall8813 = new BitSet(new long[]{0x0002800010000002L});
    public static final BitSet FOLLOW_28_in_ruleXConstructorCall8834 = new BitSet(new long[]{0x0000800080000020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8856 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_46_in_ruleXConstructorCall8869 = new BitSet(new long[]{0x0000800080000020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall8890 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_27_in_ruleXConstructorCall8904 = new BitSet(new long[]{0x0002800000000002L});
    public static final BitSet FOLLOW_47_in_ruleXConstructorCall8927 = new BitSet(new long[]{0x38A78218900041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall9000 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9028 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXConstructorCall9041 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall9062 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_48_in_ruleXConstructorCall9079 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXConstructorCall9114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral9151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral9161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleXBooleanLiteral9208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleXBooleanLiteral9232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral9282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral9292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleXNullLiteral9338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNumberLiteral_in_entryRuleXNumberLiteral9374 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNumberLiteral9384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleXNumberLiteral9439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral9475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral9485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral9536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral9577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral9587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleXTypeLiteral9633 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXTypeLiteral9645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral9668 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXTypeLiteral9680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression9716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression9726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleXThrowExpression9772 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression9793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression9829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression9839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleXReturnExpression9885 = new BitSet(new long[]{0x38A28218100041F2L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression9916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression9953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression9963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleXTryCatchFinallyExpression10009 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression10060 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression10082 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleXTryCatchFinallyExpression10126 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression10147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause10185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause10195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleXCatchClause10240 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleXCatchClause10253 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleFullJvmFormalParameter_in_ruleXCatchClause10274 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXCatchClause10286 = new BitSet(new long[]{0x38A28218100041F0L,0x00000000000003FDL});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause10307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName10344 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName10355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10402 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleQualifiedName10430 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_ruleQualifiedName10453 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber10507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber10518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleNumber10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10590 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10616 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleNumber10636 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber10652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleNumber10678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference10731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference10741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference10789 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_ruleJvmTypeReference10827 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleJvmTypeReference10839 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference10871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef10906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef10916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXFunctionTypeRef10954 = new BitSet(new long[]{0x0001800080000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef10976 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_46_in_ruleXFunctionTypeRef10989 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11010 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_48_in_ruleXFunctionTypeRef11026 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleXFunctionTypeRef11040 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef11061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference11097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference11107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference11155 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleJvmParameterizedTypeReference11176 = new BitSet(new long[]{0x0000800080000020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11198 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_46_in_ruleJvmParameterizedTypeReference11211 = new BitSet(new long[]{0x0000800080000020L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference11232 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_27_in_ruleJvmParameterizedTypeReference11246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference11284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference11294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference11341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference11368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference11403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference11413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleJvmWildcardTypeReference11459 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002001L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference11481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference11508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound11546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound11556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleJvmUpperBound11593 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound11614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded11650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded11660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleJvmUpperBoundAnded11697 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded11718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound11754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound11764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleJvmLowerBound11801 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound11822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_entryRuleValidID11861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValidID11872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValidID11911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred1_InternalGuixDsl883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred2_InternalGuixDsl1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred3_InternalGuixDsl1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred4_InternalGuixDsl1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred5_InternalGuixDsl2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred6_InternalGuixDsl2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred7_InternalGuixDsl2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred8_InternalGuixDsl2631 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred8_InternalGuixDsl2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred9_InternalGuixDsl2718 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_synpred9_InternalGuixDsl2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred10_InternalGuixDsl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred11_InternalGuixDsl3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred12_InternalGuixDsl3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred13_InternalGuixDsl3973 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred13_InternalGuixDsl3982 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred13_InternalGuixDsl3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred14_InternalGuixDsl4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred14_InternalGuixDsl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_synpred14_InternalGuixDsl4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred15_InternalGuixDsl4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGuixDsl4404 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_synpred16_InternalGuixDsl4411 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred16_InternalGuixDsl4418 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_synpred16_InternalGuixDsl4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred17_InternalGuixDsl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred18_InternalGuixDsl5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGuixDsl5355 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_synpred20_InternalGuixDsl5362 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalGuixDsl5369 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_synpred20_InternalGuixDsl5383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_synpred22_InternalGuixDsl6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred23_InternalGuixDsl6308 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred23_InternalGuixDsl6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred24_InternalGuixDsl6390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred24_InternalGuixDsl6397 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_synpred24_InternalGuixDsl6403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_synpred25_InternalGuixDsl7668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValidID_in_synpred25_InternalGuixDsl7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred26_InternalGuixDsl8239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalGuixDsl8291 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_synpred27_InternalGuixDsl8298 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred27_InternalGuixDsl8305 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_synpred27_InternalGuixDsl8319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred28_InternalGuixDsl8439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred29_InternalGuixDsl8826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred30_InternalGuixDsl8919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalGuixDsl8949 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_46_in_synpred31_InternalGuixDsl8956 = new BitSet(new long[]{0x0000800080000020L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred31_InternalGuixDsl8963 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_50_in_synpred31_InternalGuixDsl8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred32_InternalGuixDsl9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred33_InternalGuixDsl9899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred34_InternalGuixDsl10044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_synpred35_InternalGuixDsl10074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_synpred37_InternalGuixDsl10421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_synpred38_InternalGuixDsl10804 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_synpred38_InternalGuixDsl10808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred39_InternalGuixDsl11168 = new BitSet(new long[]{0x0000000000000002L});

}